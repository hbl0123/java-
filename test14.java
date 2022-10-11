package com.homeWork.test;

import java.util.Scanner;

/*        李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，
        而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。
        为了更省钱，李雷要不要以旧换新？请在控制台输出。

public class test14 {
    public static void main(String[] args) {
        double  discount = 7889 * 0.8;
        double price = 7889 - 1500;
        if(discount > price){
            System.out.println("要以旧换新");
        }else{
                System.out.println("不要以旧换新");
    }
    }
}

 让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。

public class test14 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = qj.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = qj.nextInt();
        System.out.println("请输入第三个数字");
        int number3 = qj.nextInt();

        //三目运算符，简单

        int min = number1 > number2 ? number2 : number1;
        System.out.println(number3 > min ? min : number3);
    }
}
某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
	存期		年利率（%）
	一年		2.25
	两年		2.7
	三年		3.25
	五年		3.6
请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
public class test14 {
    public static void main(String[] args) {
        int money = 1000;
        Scanner qj = new Scanner(System.in);
        System.out.println("请输入存入的年份");
        int year =  qj.nextInt();
        double tax = 0;
      switch (year){
          case 1 -> tax = 0.0225;
          case 2 -> tax = 0.027;
          case 3 -> tax = 0.0325;
          case 5 -> tax = 0.036;

      }

        double increase = money * (1 + tax * year);
      System.out.println(increase);
    }
}
某商场购物可以打折，具体规则如下：

       	普通顾客购不满100元不打折，满100元打9折；

        会员购物不满200元打8折，满200元打7.5折；

       	不同打折规则不累加计算。

        请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。
public class test14 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);
        System.out.println("你是什么类型的顾客呐");
        int number = qj.nextInt();
        System.out.println("你买到的东西多少钱呐");
        int originalPrice = qj.nextInt();

        double discount = 0;

        if(number == 1){
            if(originalPrice > 100){
                discount = originalPrice * 0.9;
                System.out.println(discount);
            }else{
            System.out.println(originalPrice);}
        }
        else if (number == 2) {
            if(originalPrice > 200){
                discount = originalPrice * 0.75;
                System.out.println(discount);
            }else{
                discount = originalPrice * 0.8;
                System.out.println(discount);
            }
        }

    }
}
 2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。
 也就是说税前工资扣除三险一金（三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。
 如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：
    0 ~ 3000元的部分，交税3%
    3000 ~ 12000元的部分，交税10%
    12000 ~ 25000的部分 ， 交税20%
    25000 ~ 35000的部分，交税25%
    35000 ~ 55000的部分，交税30%
    55000 ~ 80000的部分，交税35%
    超过80000的部分，交税45%
比如：黑马某学员入职一家企业后，税前工资是15000，则他每月该交个税的部分个税是15000-1500-5000=8500元，
缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。
请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？
 */
public class test14 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);
        System.out.println("请输入你的税前工资，好吧？");
        int salary = qj.nextInt();
        double number = 0;

        double  lateSalary = salary *1 - 0.1 * salary;
        if(lateSalary < 5000){
        }else {
            number = lateSalary - 5000;
        }

        if(number <3000 && number > 0){
            number = number * 0.03;
        } else if (number>3000 && number < 12000) {
            number = (number - 3000) * 0.1 + 3000 * 0.03;
        } else if (number>12000 && number <25000) {
            number = (number - 12000) * 0.2 + 9000 * 0.1 + 3000 * 0.3;
        } else if (number>25000 && number <35000) {
            number = (number - 25000) *0.25 + 13000 * 0.2 + 9000 * 0.1 + 3000 * 0.3;
        } else if (number>35000 && number <55000) {
            number = (number - 35000) *0.3 + 10000 * 0.25 + 13000 * 0.2 + 9000 * 0.1 + 3000 * 0.3;
        } else if (number>55000 && number <80000) {
            number = (number - 55000) *0.35 + 20000 * 0.3 + 10000 * 0.25 + 13000 * 0.2 + 9000 * 0.1 + 3000 * 0.3;
        } else if (number > 80000) {
            number = (number - 80000)*0.45 + 25000 * 0.35 + 20000 * 0.3 + 10000 * 0.25 + 13000 * 0.2 + 9000 * 0.1 + 3000 * 0.3;
        }
        System.out.println("你的所得税"+number);
        System.out.println("你的工资是"+ (lateSalary - number));
    }
}