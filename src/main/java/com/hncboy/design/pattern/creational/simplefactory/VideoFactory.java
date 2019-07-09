package com.hncboy.design.pattern.creational.simplefactory;

/**
 * Created by IntelliJ IDEA.
 * User: hncboy
 * Date 2019/7/9
 * Time: 12:25
 */
class VideoFactory {

    Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return video;
    }

    /*public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }*/
}
