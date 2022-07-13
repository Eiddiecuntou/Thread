package com.cuntou.创建线程的方式.继承thread;

/**
 * @ClassName : test  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/12  20:57
 */

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //启动
        myThread.start();
    }
}
