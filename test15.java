package com.homeWork.test;
/*模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。
        要求：
        ​	键盘录入三个整数,其中前两个整数代表参加运算的数据，第三个整数为要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:
        ​	请输入第一个整数: 30
        ​	请输入第二个整数: 40
        ​	请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1
        ​	控制台输出:30+40=70
 */

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
