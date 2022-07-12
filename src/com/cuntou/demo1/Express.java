package com.cuntou.demo1;

/**
 * @ClassName : Express  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/12  20:35
 */

public class Express {
    private Integer id;

    public Express(Integer id) {
        this.id = id;
    }

    public void get() {
        System.out.println("开始取快递");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("完成取快递");
    }
}
