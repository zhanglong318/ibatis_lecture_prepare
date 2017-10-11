package com.test.dao.impl;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import com.test.dao.UserDao;
import com.test.domain.User;

import java.sql.SQLException;

public class UserDaoImpl extends SqlMapDaoTemplate implements UserDao {

    public UserDaoImpl(DaoManager daoManager) {
        super(daoManager);
    }

    @Override
    public void saveUser(User user) {
        try {
            this.getSqlMapExecutor().insert("saveUser", user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
