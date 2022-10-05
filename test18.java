package com.homeWork.test;

import java.util.Random;
import java.util.Scanner;

/*需求： 程序自动生成一个1~100的随机数字，使用程序实现猜出这个数字
 */
//获取随机数      Random,这个类就可以生成一个随机数
//                  1.导包   2.创建对象  3.
//          1.  import java.util.Random;     2.  Random r = new Random();      3.int number = r.nextInt(随机数的范围)
//                                                                                这个范围一定是从0开始的，到这个数-1结束。（包头不包尾，包左不包右）
public class test18 {
    public static void main(String[] args) {
        Random qj = new Random();
        int number1 = qj.nextInt(100) + 1;

        while (true) {
            Scanner jj = new Scanner(System.in);
            System.out.println("请输入你猜的数字");
            int number2 = jj.nextInt();

            if (number2 > number1) {
                System.out.println("猜的有点大哦，在猜一次");
            } else if (number2 < number1) {
                System.out.println("家人猜的有点小了，把你的格局打开，好吗？");
            } else {
                System.out.println("不愧是你呀，真聪明呀");
                break;
            }
        }
    }
}
