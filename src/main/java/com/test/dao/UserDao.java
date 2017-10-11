package com.test.dao;

import com.ibatis.dao.client.Dao;
import com.test.domain.User;

public interface UserDao extends Dao {

    void saveUser(User user);
}
