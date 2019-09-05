package com.hncboy.design.pattern.structural.adapter.objectadapter;

/**
 * @author hncboy
 * @date 2019/9/5 15:20
 * @description
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
