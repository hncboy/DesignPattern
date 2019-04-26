package com.hncboy.design.principle.dependenceinversion;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-04-26
 * Time: 19:10
 */
class Boy {

    private ICourse iCourse;

    void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    void studyCourse() {
        iCourse.studyCourse();
    }
}
