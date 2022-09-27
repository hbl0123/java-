package com.homeWork.test;

import java.util.Scanner;

//需求：世界上最高的山峰珠穆拉玛峰（8848.43 = 8844430毫米），假设我们用一张足够大的纸，他的厚度是0.1毫米
//          请问，我折叠多少次，可以折成珠穆拉玛峰的高度
/*public class test12 {
    public static void main(String[] args) {
        double fold = 0.1;
        int sum = 0;
        while(fold < 8844430){
            fold = fold * 2;
            sum++;
        }
        System.out.println(sum);
    }
}
//回文数
需求：给你一个整数x。
    如果X是一个回文数，打印TRUE，否则，返回false
解释：回文数是指正序（从左到右）和倒叙（从右到左）读都是一样的整数。
例如：121是回文，而123不是
 */
public class test12 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);
        System.out.println("请输入一个数X");
        int number1 = qj.nextInt();//键盘录入一个数X
        int number3 = number1;//定义一个临时变量
        int number2 = 0;

        while (number1 != 0){
            int ge = number1 % 10;
            number1 = number1 / 10;

            number2 = number2 * 10 + ge;//将这个整数反转一次
        }
        if(number3 == number2){
            System.out.println(number3);
            System.out.println("对了，这个数就是一个回文数。所以打印true");
        }
        else{
        System.out.println("不是回文数，所以打印false");}
    }
}