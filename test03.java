package com.homeWork.test;

import java.util.Scanner;

/*数字6是一个伟大的数字，键盘录入两个整数。
      如果其中一个为6，最终输出结果TRUE。
      如果它们的和为6的倍数，最终输出结果TRUE
      其他情况都为false                 */
public class test03 {
    public static void main(String[] args) {
        //1.键盘录入
        //2.a,b是否为6，（a+b）%6是否等于0
        Scanner qj = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number1 = qj.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = qj.nextInt();

        boolean result = number1 == 6 || number2 == 6 ||( number1 + number2) %6 == 0;

        System.out.println(result);

    }
}
