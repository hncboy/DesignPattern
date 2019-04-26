package com.hncboy.design.principle.openclose;

/**
 * Created by IntelliJ IDEA.
 * Hncboy: hncboy
 * Date: 2019-04-25
 * Time: 17:33
 */
public class JavaDiscountCourse extends JavaCourse {

    JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    Double getOriginalPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
