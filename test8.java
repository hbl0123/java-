package com.homeWork.test;

import java.util.Scanner;

//键盘录入一个三位数，求这个三位数每一位的数字和。
public class test8 {
    public static void main(String[] args) {
        System.out.print("请输入一个数");
        Scanner qj = new Scanner(System.in);
        int number = qj.nextInt();
        int number1 = number /100 % 10;
        int number2 = number /10 % 10;
        int number3 = number % 10;

        System.out.print(number1 + number2 +number3);
    }
}
