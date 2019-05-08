package com.hncboy.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-05-08
 * Time: 19:01
 */
public class Child extends Base {

    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message", "子类method被执行");
        return hashMap;
    }
}
