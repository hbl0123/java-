package com.homeWork.test;
//逢七过：
/* 朋友聚会的时候可能会玩一个游戏：逢七过
游戏规则： 从任意的一个数字开始报数，当你要报的数字是包含7或者是7的倍数是要说：过
需求： 使用程序在控制台打印出1~100之间的返祖逢七必过规则的数据
 */
public class test16 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 10 == 7 || i / 10 % 10 == 7 || i % 7 ==0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
