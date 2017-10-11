package com.test.dao.config;

import com.ibatis.common.resources.Resources;
import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.DaoManagerBuilder;

import java.io.Reader;
import java.util.Properties;

public class DaoConfig {

    private static final String resource = "dao.xml";

    private static final DaoManager daoManager;

    static {
        daoManager = buildDaoManager();
    }

    public static DaoManager getDaoManager() {
        return daoManager;
    }

    public static DaoManager buildDaoManager() {
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            return DaoManagerBuilder.buildDaoManager(reader);
        } catch (Exception e) {
            new RuntimeException("Could not initialize DaoConfig.  Cause: " + e, e);
        }
        return null;
    }
}
