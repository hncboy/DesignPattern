package com.hncboy.design.pattern.structural.adapter.classadapter;

/**
 * @author hncboy
 * @date 2019/9/5 15:13
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
