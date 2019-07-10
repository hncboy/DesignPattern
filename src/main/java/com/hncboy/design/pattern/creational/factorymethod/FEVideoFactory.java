package com.hncboy.design.pattern.creational.factorymethod;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date 2019/7/10
 * Time: 13:36
 */
public class FEVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
