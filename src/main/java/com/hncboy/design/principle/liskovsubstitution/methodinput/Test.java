package com.hncboy.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-05-08
 * Time: 18:52
 */
public class Test {

    public static void main(String[] args)   {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
