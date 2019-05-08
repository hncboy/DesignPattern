package com.hncboy.design.principle.liskovsubstitution;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-05-08
 * Time: 18:36
 */
public class Square implements Quadrangle  {

    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }
}
