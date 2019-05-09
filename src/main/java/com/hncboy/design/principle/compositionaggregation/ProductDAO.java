package com.hncboy.design.principle.compositionaggregation;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-05-09
 * Time: 9:01
 */
class ProductDAO {

    private DBConnection dbConnection;

    void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}
