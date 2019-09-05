package com.hncboy.design.pattern.structural.adapter.classadapter;

/**
 * @author hncboy
 * @date 2019/9/5 15:11
 * @description
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
