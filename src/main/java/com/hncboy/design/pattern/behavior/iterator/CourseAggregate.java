package com.hncboy.design.pattern.behavior.iterator;

/**
 * @author hncboy
 * @date 2019/9/5 13:40
 * @description Course 功能
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
