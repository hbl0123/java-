package com.homeWork.test;

import java.util.Scanner;

/*某小伙想定一份外卖，商家的优惠方式如下：
        鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。订单满30元8折优惠。
        鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。
        那么这个小伙要点这三样东西，最少要花多少钱？*/
public class test7 {
            public static void main(String[] args) {
                System.out.println("请依次输入鱼香肉丝，油炸花生米，米饭的价格");
                Scanner qijia1 = new Scanner(System.in);
                int price1 = qijia1.nextInt();
                Scanner qijia2 = new Scanner(System.in);
                int price2 = qijia2.nextInt();
                Scanner qijia3 = new Scanner(System.in);
                int price3 = qijia3.nextInt();

                int price = price1 + price2 + price3;

                int original = 24 + 8 + 3;

              double discount1 =   30 < original ? original * 0.8 : 30;
                double discount2 = 16 + 8 + 3;
            System.out.print(  discount1 < discount2 ? "第一种" : "第二种");
            System.out.println(discount1);
                System.out.println(discount2);
            }
}
