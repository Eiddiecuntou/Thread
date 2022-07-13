package com.cuntou.创建线程的方式.实现Runnable;

/**
 * @ClassName : Test1  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/12  21:00
 */
//自定义一个类，实现Runnable接口
//创建一个Thread，将创建的Runnable 对象注入到Thread对象中，启动thread对象
//任务是具体要做的事情，线程指的是具体执行任务的对象
//张三取快递，张三线程就是thread
//取快递任务是runnable

public class Test1 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
