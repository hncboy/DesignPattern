package com.hncboy.design.pattern.behavior.iterator;

/**
 * @author hncboy
 * @date 2019/9/5 13:41
 * @description Course 迭代器
 */
public interface CourseIterator {

    /**
     * 下一个课程
     *
     * @return
     */
    Course nextCourse();

    /**
     * 判断是否是最后一个课程
     *
     * @return
     */
    boolean isLastCourse();
}
