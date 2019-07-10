package com.hncboy.design.pattern.creational.factorymethod;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date 2019/7/9
 * Time: 12:23
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
