package com.homeWork.test;

import java.util.Scanner;
/*
public class test10 {
    public static void main(String[] args) {
        需求：键盘录入星期数，输出工作日，休息日。
        （1-5）工作日  （6-7）休息日

        Scanner qj = new Scanner(System.in);
        System.out.println("请输入一个星期天的数");
        int week = qj.nextInt();
        switch (week){
            case 1,2,3,4,5 -> System.out.println("今天是一个工作日哦");

            default -> System.out.println("又是开心的一天那");
        }
    }
}
在实际开发中，如果我们需要在多种情况下选择一个，就可以使用Switch语句
当我们拨打某写服务电话，一般会有按键选择
假设现在我们拨打了一个机票预订的电话
1.机票预订
2.机票查询
3.机票改签
4.退出服务
其他按键也是退出服务。

 */

public class test10 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int choose = qj.nextInt();
        switch (choose){
            case 1 -> System.out.println("机票预订");
            case 2 -> System.out.println("机票改签");
            case 3 -> System.out.println("机票查询");
            case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }
}


