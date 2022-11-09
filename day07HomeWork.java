package com.宝贝.作业;

import java.util.Random;

//抢红包：
//需求： 一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
//         请使用代码模拟抽奖，打印出每一个奖项，奖项的出现顺序要随机且不重复。
//         打印效果： （随机顺序，不一定是下面的顺序）
public class day07HomeWork {
    public static void main(String[] args) {
        //思路：
        //1.先建立一个一维数组，存放2,588,888,1000,10000
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] brr = new int[arr.length];
        //2.利用Random()函数随机生成数字
        Random q = new Random();
        //3.抽奖：
        for (int i = 0; i < arr.length;) {
            int number = q.nextInt(arr.length);
            int prize = arr[number];

            //判断奖项是否存在
            boolean flag = Get(arr,prize);
            if (flag) {
                //把当前抽到的奖项，添加到brr中
                brr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }

    }

    public static boolean Get(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return false;
            }
        }
        return true;
    }
}