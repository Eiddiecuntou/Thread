package com.cuntou.线程合并;

/**
 * @ClassName : Test  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/13  14:48
 */
//不加毫秒的话直接会被抢走
//加上毫秒之后在这个时间过后，可以互相来争夺这个资源
public class Test {
    public static void main(String[] args) {
        JoinRunnable joinRunnable = new JoinRunnable();
        Thread thread = new Thread(joinRunnable);
        thread.start();
        for (int i = 0; i < 100 ; i++) {

            if (i == 20) {
                try {
                    thread.join(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println( i + "+++++++++main");
        }
    }

    //Join类
    static class JoinRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100 ; i++) {
                System.out.println( i + "--------------JoinRunnable");
            }
        }
    }
}
