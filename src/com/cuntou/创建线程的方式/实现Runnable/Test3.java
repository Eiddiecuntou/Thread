package com.cuntou.创建线程的方式.实现Runnable;

/**
 * @ClassName : Test3  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/13  14:34
 */

public class Test3 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100 ; i++) {
                    System.out.println(Thread.currentThread().getName() + "--" + i);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
