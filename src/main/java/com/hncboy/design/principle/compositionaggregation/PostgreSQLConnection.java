package com.hncboy.design.principle.compositionaggregation;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-05-09
 * Time: 9:07
 */
public class PostgreSQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
