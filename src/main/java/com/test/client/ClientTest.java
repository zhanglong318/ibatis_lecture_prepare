package com.test.client;

import com.ibatis.dao.client.DaoManager;
import com.test.dao.UserDao;
import com.test.dao.config.DaoConfig;
import com.test.domain.User;

public class ClientTest {
    public static void main(String[] args) {
        DaoManager daoManager = DaoConfig.getDaoManager();
        UserDao userDao = (UserDao) daoManager.getDao(UserDao.class);

        // 代理实例，并非我们所定义的UserDaoImpl
//        System.out.println(userDao.getClass());

        User user = new User();

        user.setId(101);
        user.setUsername("张三");
        user.setPassword("密码");

        daoManager.startTransaction();

        userDao.saveUser(user);

        daoManager.commitTransaction();
    }
}
