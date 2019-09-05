package com.hncboy.design.pattern.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hncboy
 * @date 2019/9/5 13:42
 * @description
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List<Course> courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList<>();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
