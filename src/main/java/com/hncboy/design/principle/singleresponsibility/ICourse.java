package com.hncboy.design.principle.singleresponsibility;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-04-26
 * Time: 20:05
 */
public interface ICourse {

    String getCourseName();
    byte[] getCourseVideo();
    void studyCourse();
    void refundCourse();
}
