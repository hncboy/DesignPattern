package com.hncboy.design.principle.liskovsubstitution;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-05-08
 * Time: 18:35
 */
public class Rectangle implements Quadrangle {

    private long length;
    private long width;

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }
}
