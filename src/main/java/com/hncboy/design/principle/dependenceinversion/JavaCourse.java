package com.hncboy.design.principle.dependenceinversion;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-04-26
 * Time: 19:13
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Boy在学习Java");
    }
}
