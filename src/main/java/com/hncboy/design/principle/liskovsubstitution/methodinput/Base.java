package com.hncboy.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-05-08
 * Time: 18:50
 */
public class Base {

    public void method(HashMap map) {
        System.out.println("父类被执行");
    }
}
