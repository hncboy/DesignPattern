package com.hncboy.design.principle.liskovsubstitution.methodoutput;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-05-08
 * Time: 19:01
 */
public class Test {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());
    }
}
