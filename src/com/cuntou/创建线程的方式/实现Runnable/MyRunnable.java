package com.cuntou.创建线程的方式.实现Runnable;

/**
 * @ClassName : MyRunnable  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/12  20:58
 */

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println(Thread.currentThread().getName()+ "-----" + i);
        }
    }
}
