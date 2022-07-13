package com.cuntou.线程休眠;

/**
 * @ClassName : Test2  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/13  14:41
 */
//sleep sleep在哪里就让那个线程休眠
public class Test2 {
    public static void main(String[] args) {
//        new Thread(() -> {
//            for (int i = 0; i < 100 ; i++) {
//                System.out.println(i);
//                if (i == 50) {
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }).start();

        Thread thread = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        });
        try {
            thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.start();
        for (int i = 0; i < 100 ; i++) {
            System.out.println("======main======");
        }
    }
}
