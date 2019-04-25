package com.hncboy.design.principle.openclose;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-04-25
 * Time: 17:33
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginalPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
