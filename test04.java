package com.homeWork.test;

import java.util.Scanner;

/*
import java.util.Scanner;

两只老虎
    需求： 动物园里有两只老虎，体重分别通过键盘录入获取，
          请用程序实现判断两只老虎的体重是否相等。
public class test4 {
       public static void main(String[] args) {
           Scanner qj1 = new Scanner (System.in);
           System.out.println("请输入第一个老虎的体重");
           int weight1 = qj1.nextInt();

           Scanner qj2 = new Scanner (System.in);
           System.out.println("请输入第二个老虎的体重");
           int weight2 = qj2.nextInt();

           String ainijiajia = weight1 == weight2 ? "相同" :  "不同";
           System.out.println(ainijiajia);
          System.out.println (weight1 == weight2 ? "相同" :  "不同");


       }
}
 需求： 一座寺庙里住着三个和尚，已知他们的身高分别是150cm、210cm、165cm。
        请用程序实现获取三个和尚的最高身高。
 */
public class test04 {
    public static void main(String[] args) {
        System.out.println("输入第一个和尚的身高");
        Scanner qj1 = new Scanner(System.in);
        int height1 = qj1.nextInt();
        System.out.println("输入第二个和尚的身高");
        Scanner qj2 = new Scanner(System.in);
        int height2 = qj2.nextInt();
        System.out.println("输入第三个和尚的身高");
        Scanner qj3 = new Scanner(System.in);
        int height3 = qj2.nextInt();

       int temp1 = height1 < height2 ? height2 : height1;

       System.out.println(  temp1 < height3 ? height3 : temp1);

       int height4 = 150;
       int height5 = 210;
       int height6 = 165;

        int temp2 = height4 < height5 ? height5 : height4;

        System.out.println(  temp2 < height6 ? height6 : temp2);


    }
}
