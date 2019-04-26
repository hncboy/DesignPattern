package com.hncboy.design.principle.dependenceinversion;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-04-26
 * Time: 19:11
 */
public class Test {

    // v1
    /*public static void main(String[] args) {
        Boy boy = new Boy();
        boy.studyJavaCourse();
        boy.studyPythonCourse();
        boy.studyHtmlCourse();
    }*/

    // v2
    /*public static void main(String[] args) {
        Boy boy = new Boy();
        boy.studyCourse(new JavaCourse());
        boy.studyCourse(new PythonCourse());
        boy.studyCourse(new HtmlCourse());
    }*/

    // v3
    /*public static void main(String[] args) {
       Boy boy = new Boy(new JavaCourse());
       boy.studyCourse();
    }*/

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setiCourse(new JavaCourse());
        boy.studyCourse();
        boy.setiCourse(new PythonCourse());
        boy.studyCourse();
    }
}
