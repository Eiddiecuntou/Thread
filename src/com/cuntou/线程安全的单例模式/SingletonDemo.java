package com.cuntou.线程安全的单例模式;

/**
 * @ClassName : SingletonDemo  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/13  17:01
 */

public class SingletonDemo {
    private static SingletonDemo instance;

    public static SingletonDemo getInstance(){
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }
    private SingletonDemo(){}

}
