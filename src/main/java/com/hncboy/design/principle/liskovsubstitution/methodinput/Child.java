package com.hncboy.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-05-08
 * Time: 18:51
 */
public class Child extends Base {

    /*@Override
    public void method(HashMap map) {
        System.out.println("HashMap子类被执行");
    }*/

    public void method(Map map) {
        System.out.println("Map子类被执行");
    }
}
