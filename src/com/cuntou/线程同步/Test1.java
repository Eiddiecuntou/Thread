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
//public synchronized void run ( )
//
//相当于给资源上锁，要访问资源就必须拿到锁，如果锁被其他线程拿走了，那么当前线程就只能处于阻塞状态，等待锁的释放。
public class Test1 {
    public static void main(String[] args) {
        Account1 account = new Account1();
        Thread thread1 = new Thread(account,"张三");
        Thread thread2 = new Thread(account,"李四");
        thread1.start();
        thread2.start();

    }
}

class Account1 implements Runnable{

    private static int num;

    @Override
    public synchronized void run() {
        num++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "当前是" + num + "位访客");
    }
}
