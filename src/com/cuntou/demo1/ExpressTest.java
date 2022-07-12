package com.cuntou.demo1;

/**
 * @ClassName : ExpressTest  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/12  20:42
 */

public class ExpressTest {
    public static void main(String[] args) {
        //如果要取快递的话
        //效果的话就是时间会进行一段时间
        for (int i = 0; i < 2; i++) {
            Express express = new Express(i);
            System.out.println(i);
            express.get();
        }

        //new Thread(() -> {}).start()
    }
}
