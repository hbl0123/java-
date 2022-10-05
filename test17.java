
package com.homeWork.test;

import java.util.Scanner;

//需求：键盘录入一个大于等于2的整数X,计算并返回X的平方根
//     结果只保留整数部分，小数部分将被舍掉
/*从1开始循环，拿着数字的平方根跟原来的数字进行比较
  如果小于的，继续往后判断
  如果相等，那么当前数字就是平方根‘
  如果大于的，那么这个数字就是平方根的整数部分

public class test17 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);
        System.out.println("请输入一个数");
        int number1 = qj.nextInt();

        for(int i = 1; i <= number1 ; i ++){
            if(i * i == number1){
                System.out.println(i + "就是" + number1 + "的平方根");
            }else if(i * i > number1){
                System.out.println((i - 1) + "就是" + number1 + "平方根的整数部分");
                break;
            }
        }
    }
}
求质数：
需求： 键盘录入一个正整数X,判断该数是否为一个质数
       质数: 一个整数能被1和本身整除，南无这个数就是质数。
            否则这个数就叫做合数

 */
    //1.键盘录入
    //2.写一个循环，从2开始判断，一直判断到number-1为止
    //看在这个范围之内，有没有数字可以被number整除
public class test17 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = qj.nextInt();
        boolean falg = true;

        for(int i = 2; i <= number; i++ ) {
            if (number % i == 0) {
                falg = false;
                break;
            }
        }
            if(falg){
                System.out.println(number + "是一个质数");
            }else{
                System.out.println(number + "不是一个质数");
            }
    }
}
//使用二分法更简单哦