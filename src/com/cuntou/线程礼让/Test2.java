package com.cuntou.线程礼让;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @ClassName : Test2  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/13  14:58
 */

public class Test2 {
    public static void main(String[] args) {
        YieldThread1 thread1 = new YieldThread1();
        thread1.setName("线程甲");
        YieldThread2 thread2 = new YieldThread2();
        thread2.setName("线程乙");
        thread1.start();
        thread2.start();
    }

}
class YieldThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            if(i == 10) {
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + "--------" + i);
        }
    }
}
class YieldThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println(Thread.currentThread().getName() + "--------" + i);
        }
    }
}
