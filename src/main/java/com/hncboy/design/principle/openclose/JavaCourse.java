package com.hncboy.design.principle.openclose;

/**
 * Created by IntelliJ IDEA.
 * Hncboy: hncboy
 * Date: 2019-04-25
 * Time: 17:11
 */
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
