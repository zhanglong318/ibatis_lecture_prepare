package com.test.ibatis;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.test.model.User;

import java.io.Reader;
import java.util.List;

public class ClientTest {

    public static void main(String[] args) throws Exception {

        SqlMapClient sqlMapClient = null;

        try (Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml")) {
            sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //创建用户数据
        for (int i = 0; i < 10; ++i) {
            User user = new User();

            user.setId(i);
            user.setUsername("用户名" + i);
            user.setPassword("密码" + i);

            sqlMapClient.insert("saveUser", user);
        }

        //查询用户数据
        ((List<User>) sqlMapClient.queryForList("getAllUsers")).stream().
                map(user -> user.getUsername()).
                forEach(System.out::println);

        //查询特定用户的数据
        User user = (User) sqlMapClient.queryForObject("getUserById", 1);
        System.out.println("用户【id=" + 1 + "】的用户名是：" + user.getUsername());

        //更新用户的信息
        user = new User();

        user.setUsername("新用户名");
        user.setPassword("新密码");
        sqlMapClient.update("updateUser", user);

        //删除用户的信息
        sqlMapClient.delete("removeUserById", 6);
    }
}
