package com.hncboy.design.pattern.structural.adapter.classadapter;

/**
 * @author hncboy
 * @date 2019/9/5 15:10
 * @description
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("ConcreteTarget 目标方法");
    }
}
