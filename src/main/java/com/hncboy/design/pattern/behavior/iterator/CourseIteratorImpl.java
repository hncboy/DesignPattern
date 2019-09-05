package com.hncboy.design.pattern.behavior.iterator;

import java.util.List;

/**
 * @author hncboy
 * @date 2019/9/5 13:44
 * @description TODO
 */
public class CourseIteratorImpl implements CourseIterator {

    private List<Course> courseList;
    private int position;
    private Course course;

    public CourseIteratorImpl(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("下一个课程位置：" + position);
        course = courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        return position == courseList.size();
    }
}
