package com.homeWork.test;

import java.util.Scanner;

/*题目1(训练)

         身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：

         ​	儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2

         ​	女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2

         现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？

  */
public class test5 {
     public static void main(String[] args) {
         //手动定义
         int fatherheight1 = 177;
         int motherheight1 = 165;
         double sonheight1 =  (fatherheight1 + motherheight1) * 1.08 / 2;
         double girlheght1 =  (fatherheight1 * 0.923 + motherheight1) / 2;
         System.out.println(sonheight1);
         System.out.println(girlheght1);


         //键盘录入
         System.out.println("请输入爸爸的身高");
         Scanner qj1 = new Scanner(System.in);
         int fatherheight2 = qj1.nextInt();

         System.out.println("请输入妈妈的身高");
         Scanner qj2 = new Scanner(System.in);
         int motherheight2 = qj2.nextInt();

         double sonheight2 =  (fatherheight2 + motherheight2) * 1.08 / 2;
         double girlheght2 =  (fatherheight2 * 0.923 + motherheight2) / 2;
         System.out.println(sonheight2);
         System.out.println(girlheght2);


     }
}
