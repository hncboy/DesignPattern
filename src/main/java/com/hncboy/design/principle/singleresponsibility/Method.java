package com.hncboy.design.principle.singleresponsibility;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date: 2019-04-26
 * Time: 20:09
 */
public class Method {

    private void updateUserInfo(String userName, String address) {
        userName = "hncboy";
        address = "Zhejiang";
    }

    private void updateUserInfo(String userName, String ... properties) {
        userName = "hncboy";
    }

    private void updateUserName(String userName) {
        userName = "hncboy";
    }

    private void updateUserAddress(String address) {
        address = "Zhejiang";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            // TODO something1
        } else {
            // TODO something2
        }
        userName = "hncboy";
        address = "Zhejiang";
    }
}
