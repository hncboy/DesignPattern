package com.hncboy.design.pattern.structural.adapter;

/**
 * @author hncboy
 * @date 2019/9/5 15:29
 * @description 电源适配器
 */
public class PowderAdapter implements DC5 {

    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println("输入：" + adapterInput);
        System.out.println("输出：" + adapterOutput);

        return adapterOutput;
    }
}
