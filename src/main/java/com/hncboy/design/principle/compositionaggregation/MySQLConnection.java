package com.hncboy.design.principle.compositionaggregation;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-05-09
 * Time: 9:05
 */
public class MySQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
