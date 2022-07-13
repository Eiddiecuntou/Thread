package com.cuntou.死锁;

import java.security.spec.DSAGenParameterSpec;

/**
 * @ClassName : DeadLockRunnable  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/13  18:07
 */

public class DeadLockRunnable implements Runnable {
    public int num;
    private static Data data1 = new Data();
    private static Data data2 = new Data();
    @Override
    public void run() {
        if(num == 1){
            System.out.println(Thread.currentThread().getName() + "获取到了data1，等待获取data2");
            //获取data1
            synchronized (data1){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //获取data2
                synchronized (data2){
                    System.out.println(Thread.currentThread().getName() + "用餐完毕");
                }
            }
        }
        if(num == 2){
            System.out.println(Thread.currentThread().getName() + "获取到了data2，等待获取data1");
            synchronized (data2){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (data1){
                    System.out.println(Thread.currentThread().getName() + "用餐完毕");
                }
            }
        }
    }

        }



