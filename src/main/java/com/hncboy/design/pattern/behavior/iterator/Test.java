package com.hncboy.design.pattern.behavior.iterator;

/**
 * @author hncboy
 * @date 2019/9/5 13:52
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Course course1 = new Course("Java");
        Course course2= new Course("Python");
        Course course3 = new Course("Go");
        Course course4 = new Course("C++");
        Course course5 = new Course("C");
        Course course6 = new Course("Javascript");

        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("课程列表：");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("更新后课程列表：");
        printCourses(courseAggregate);
    }

    private static void printCourses(CourseAggregate courseAggregate) {
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()) {
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
