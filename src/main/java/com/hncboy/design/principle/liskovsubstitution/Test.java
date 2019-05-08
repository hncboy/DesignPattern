package com.hncboy.design.principle.liskovsubstitution;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-05-08
 * Time: 18:39
 */
public class Test {

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width = " + rectangle.getWidth());
            System.out.println("length = " + rectangle.getLength());
        }
        System.out.println("resize width = " + rectangle.getWidth());
        System.out.println("resize length = " + rectangle.getLength());
    }

    /*public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }*/

    public static void main(String[] args) {
        Square square = new Square();
    }
}
