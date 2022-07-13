package com.cuntou.创建线程的方式.实现Runnable;

import org.omg.IOP.TAG_JAVA_CODEBASE;

/**
 * @ClassName : Test4  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/13  14:37
 */
//方法实现作为参数来进行传递
public class Test4 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "--" + i);
            }
        });
        thread.start();
    }
}
