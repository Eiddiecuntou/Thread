package com.cuntou.线程同步;

/**
 * @ClassName : Test2  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/13  15:23
 */

public class Test2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
//                Test.test();
                Test2 test = new Test2();
                test.test();
            });
            thread.start();
        }
    }

    public void test(){
        synchronized (this){
            System.out.println("start...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end...");
        }
    }
}
