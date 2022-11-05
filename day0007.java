package com.宝贝.学习天数;

public class day0007 {
    public static void main(String[] args){
        //创建手机对象
        day007 p = new day007();

        //叫做给手机赋值
        p.brand = "小米";
        p.price = 19999;

        //获取手机对象中的值
        p.call();
        p.playGame();

        day007 p2 = new day007();
        p2.brand = "苹果";
        p2.price = 88888;

        p2.call();
        p2.playGame();
    }
}