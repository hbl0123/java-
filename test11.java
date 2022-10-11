package com.homeWork.test;

import java.util.Scanner;

/*
在实际开发中，需要重复执行的代码，会选择循环实现。
比如：如左图所示。玩游戏的时候，如果网不好那么会经常断线重连。
那么断线重连这个逻辑就需要重复执行
假设现在公司要求，断线重连的业务逻辑最多只写5次。
请用代码实现。

public class test11 {
    public static void main(String[] args) {
        for(int i = 1;i <= 5; i++){
            System.out.println("执行第" + i +"次执行断线重连业务逻辑");
        }
    }
}
 求和：
 需求：在实际开发中，如果要获取一个范围中的每一个数据时，也会用到循环。
 比如：求1-5之间的和

public  class test11 {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1;i <= 100;i++){
            total = total + i;
        }
        System.out.println(total);
    }
}

//比如：求1-100之间的偶数和
public class test11 {
    public static void main(String[] args) {
        int number = 0;
        for(int i = 1; i<= 100; i++){
            if(i % 2 ==0){
                 number = number + i;
            }
        }
        System.out.print(number);
    }
}
 */
//需求：键盘录入两个数字，表示一个范围，统计这个范围中能被3整除，又能被5整除的数字有多少个?
public class test11 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner qj = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = qj.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = qj.nextInt();

        if(number2 > number1 ){
            for(;number1 < number2;number1 ++){
                if(number1 % 3 == 0 && number1 % 5 ==0){
                    sum++;
                    System.out.println(number1);
                }
            }
            System.out.println(sum);
        }
        if(number2 < number1 ){
            for(;number1 > number2;number2 ++){
                if(number2 % 3 == 0 && number2 % 5 ==0){
                    sum++;
                    System.out.println(number2);
                }
            }
            System.out.println(sum);
        }


    }
}