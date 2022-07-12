package com.cuntou.demo;

/**
 * @ClassName : test  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/12  20:32
 */

public class test {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100 ; i++) {
                System.out.println("=======thread====");
            }
        }).start();
    }
}
