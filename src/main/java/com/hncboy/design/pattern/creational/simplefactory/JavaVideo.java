package com.hncboy.design.pattern.creational.simplefactory;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date 2019/7/9
 * Time: 12:22
 */
public class JavaVideo extends PythonVideo {

    @Override
    public void product() {
        System.out.println("学习Java");
    }
}
