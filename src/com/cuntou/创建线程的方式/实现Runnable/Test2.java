package com.cuntou.创建线程的方式.实现Runnable;

/**
 * @ClassName : Test2  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/13  10:38
 */

//使用匿名内部类
public class Test2 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }


    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100 ; i++) {
                System.out.println(Thread.currentThread().getName() + "--" + i);
            }
        }
    }
}
