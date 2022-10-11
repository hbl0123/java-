package com.homeWork.test;

import java.util.Scanner;

/*模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。
        要求：
        ​	键盘录入三个整数,其中前两个整数代表参加运算的数据，第三个整数为要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:
        ​	请输入第一个整数: 30
        ​	请输入第二个整数: 40
        ​	请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1
        ​	控制台输出:30+40=70


import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner qj= new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int number1 = qj.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = qj.nextInt();
        System.out.println("请输入你想进行的运算符");
        int falg = qj.nextInt();
        int result = 0;
        switch (falg) {
            case 1:
                System.out.println(  result  =  number1 + number2 );
                break;
            case 2:
                System.out.println(result = number1 - number2);
                break;
            case 3:
                System.out.println(result = number1 * number2);
                break;
            case 4:
                System.out.println(result = number1 / number2);
                break;
        }
    }
}
//键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。
public class test15 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);
        int number1 = qj.nextInt();
        int number2 = qj.nextInt();
        int sum = 0;
        for (; number1 <= number2 ; number1++) {
            sum = number1 + sum;
        }
        System.out.println(sum);
    }
}

//需求：键盘录入两个数字，表示一个范围。
//统计这个范围中。 既能被3整除，又能被5整除数字有多少个？
public class test15 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);
        int number1 = qj.nextInt();
        int number2 = qj.nextInt();

        for (; number1 <= number2; number1++) {
            ;if(number1 % 3 ==0 && number1 % 5 ==0) {
                System.out.println(number1);
            }
        }
    }
}
需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，

        ​	假如我有一张足够大的纸，它的厚度是0.1毫米。

        ​	请问，我折叠多少次，可以折成珠穆朗玛峰的高度
 */
public class test15 {
    public static void main(String[] args) {
        double fold = 0.1;
        int time = 0;
        while (fold <= 8844430){
            fold = fold * 2;
            time++;
        }
        System.out.println(time);
    }
}