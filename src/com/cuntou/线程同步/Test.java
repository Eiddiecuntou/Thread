package com.cuntou.线程同步;

/**
 * @ClassName : Test  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/13  15:09
 */

//异步和同步
//异步指的是A和B同时进行，互不影响
//同步指的是A和B顺序执行，排队工作
//异步的话，指的是多线程之间的关系
//同步的话，指的是多个线程都要看成一个线程来做
public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        Thread thread1 = new Thread(account,"张三");
        Thread thread2 = new Thread(account,"李四");
        thread1.start();
        thread2.start();

    }
}
class Account implements Runnable{

    private static int num;

    @Override
    public void run() {
        num++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "当前是" + num + "位访客");
    }
}
