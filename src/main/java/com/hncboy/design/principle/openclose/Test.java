package com.hncboy.design.principle.openclose;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-04-25
 * Time: 17:12
 */
public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1, "设计模式之禅", 89d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程名称：" + javaCourse.getId() + " 课程名称：" + javaCourse.getName() + " 课程原价：" + javaCourse.getOriginalPrice() + " 课程折后价格：" + javaCourse.getPrice() + "元");
    }
}
