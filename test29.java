package com.宝贝.test;
//day06的作业没有做哟                    知道不

import java.util.Scanner;

//本节test练习的是day07的练习题
/*需求：
     机票的价格按照谈季旺季、头等舱、经济舱收费的、输入机票的价格，月份、头等舱或经济舱
     按照如下规则计算机票的价格，旺季（5-10月）头等舱9折、经济舱8.5折。淡季（11月--来年4月）头等舱7折，经济舱6.5折
public class test29 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);

        System.out.println("请输入机票的价格");
        double airFare = qj.nextInt();

        System.out.println("请输入买机票的月份");
        int month = qj.nextInt();

        System.out.println("请输入所购买的舱位(输入‘1’则为头等舱，输入'2'则为经济舱)");
        double shippingSpace = qj.nextInt();

        int[] month1 = {5, 6, 7, 8, 9, 10};
        int[] month2 = {1, 2, 3, 4, 11, 12};//运用 || 语句，会更方便哦
        for (int i = 0; i < month1.length; i++) {
            if (month == month1[i]) {
                System.out.println(discount(airFare, shippingSpace, 0.9, 0.85));
                break;
            } else if (month == month2[i]) {
                System.out.println(discount(airFare, shippingSpace, 0.7, 0.65));
                break;
            }
        }
    }
    public static double discount(double airFare, double shippingSpace, double v0, double v1) {
        if (shippingSpace == 1) {
            airFare = airFare * v0;
        } else {
            airFare = airFare * v1;
        }
        return airFare;
    }
}

ctrl + alt + M 自动抽取代码
 需求： 判断 101 ~ 200之间有多少个素数，并输出所有素数 （只能被 1 和 自己 整除）

public class test29 {
    public static void main(String[] args) {
        //思路 一：2 ~ 这个数
        //思路 二：2 ~ 这个数的平方根
        for (int i =100; i <201; i++) {
            boolean falg = true;//重置 falg 的值
            for (int k = 2; k < i; k++) {
                if(i % k == 0){
                    falg = false;
                    break;
                }
            }
            if(falg){
                System.out.print(i + "  ");
            }
        }
    }
}

//需求：
        在唱歌比赛中，有6名评委给选手打分，分数范围是[0 ~ 100]之间的整数。
        选手的最后得分为：去掉最高分，最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分
 */
public class test29 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);

        double []arr =new double[6];

        for (int i = 0; i < arr.length; ) {
            System.out.println("第" + i +"位评委的打分是");
            double number = qj.nextInt();
            if(number > 0 && number < 100){
                arr[i] = number;
                i++;//点睛之笔（秒芽苗亚）
            }else {
                System.out.println("请重新输入分数");
            }
        }
        array(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        double sum = 0;
        for (int i = 1; i < arr.length - 1 ; i++) {
            sum = sum + arr[i];
        }
        System.out.println("你的平均分是" + sum / 4);
    }
    public static double[] array(double []arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    double temp;
                    temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}

