package com.application;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：李佳模 ON：2020/10/30
 * description:
 */
public class BaseApplication extends Application {
    public static List<Activity> allActivitys= new ArrayList<>();
    public  static  BaseApplication baseApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
    }
    public static  Application getInstence(){
        return baseApplication;
    }
}
