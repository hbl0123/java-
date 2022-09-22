package com.homeWork.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
       //键盘录入一个三位数，获取其中的个位，十位，百位

        //1.键盘录入
        Scanner qj =new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = qj.nextInt();

        //2.获取个位，十位，百位
        //公式：
        //个位： 数字 % 10
        //十位： 数字 / 10 % 10
        //百位:  数字 / 100 % 10
        //...
        int gewei = number % 10;
        int shiwei = number / 10 % 10;
        int baiwei = number / 100 % 10;
        System.out.println(gewei);
        System.out.println(shiwei);
        System.out.println(baiwei);
    }
}
