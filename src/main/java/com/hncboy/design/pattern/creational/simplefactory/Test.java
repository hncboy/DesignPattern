package com.hncboy.design.pattern.creational.simplefactory;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date 2019/7/9
 * Time: 12:23
 */
public class Test {

    public static void main(String[] args) {
        /*VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video == null) {
            return;
        }
        video.product();*/

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.product();
    }
}
