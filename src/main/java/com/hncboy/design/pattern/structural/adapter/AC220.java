package com.hncboy.design.pattern.structural.adapter;

/**
 * @author hncboy
 * @date 2019/9/5 15:25
 * @description 220V 交流电 被适配者
 */
public class AC220 {

    public int outputAC220V() {
        int output = 220;
        System.out.println("输出交流电 = " + output + "V");
        return output;
    }
}
