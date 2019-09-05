package com.hncboy.design.pattern.structural.adapter;

/**
 * @author hncboy
 * @date 2019/9/5 15:31
 * @description
 */
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowderAdapter();
        dc5.outputDC5V();
    }
}
