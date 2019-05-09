package com.hncboy.design.principle.compositionaggregation;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-05-09
 * Time: 9:02
 */
public class Test {

    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        productDAO.setDbConnection(new MySQLConnection());
        productDAO.addProduct();
    }
}
