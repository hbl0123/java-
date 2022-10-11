package com.homeWork.test;

import java.util.Scanner;

//小红： 如果你这次考试全班第一名，我就做你女朋友。
/*public class test9 {
    public static void main(String[] args) {
        int ranking = 1;
        if(ranking  == 1){
            System.out.println("小红成为了小明的女朋友");
        }
    }
}
//自动驾驶
//当汽车行驶的时候遇到了红灯，就会进行判断
//如果红灯亮，就停止
//如果黄灯亮，就减速
//如果绿灯亮，就行驶
public class test9 {
    public static void main(String[] args) {
//1.定义三个变量来表示灯的状态
//true 亮   false 灭
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;

        if(isLightGreen){
            System.out.println("GOGOGO!!");
        }
        if(isLightYellow){
            System.out.println("请减速！！");
        }
        if(isLightRed){
            System.out.println("Stop!!");
        }
    }
}
//键盘录入一个整数，表示身上的钱。
//如果大于100元，就是网红餐厅
//否则，就吃经济实惠的沙县小吃
public class test9 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);
        System.out.println("请输入你身上的钱");
        int money = qj.nextInt();

        if(money >100){
            System.out.println("去网红餐厅吃饭，干饭干饭！！");
            }
        else{System.out.println("吃沙县小吃，美味美味！！");}
    }
}*/
//影院选座
/*在实际开发中，电影院的选座也会使用到if判断
假设某影院售卖了100张票，票的序号为1~100
其中奇数票号做左侧，偶数票号做右侧
键盘录入一个正数表示电影院的票号
根据不同情况，给出不同的提示
如果票号为奇数，那么打印坐左边
如果票号为偶数，那么打印做右边

public class test9 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);
        System.out.println("请输入一个票号");
        int ticket = qj.nextInt();
        if(ticket > 0 && ticket <= 100) {
            if (ticket % 2 == 1) {
                System.out.println("请坐左边");
            } else {
                System.out.println("请坐右边");
            }
        }
    }
}
 */
/*
根据不同的分数送不同的礼物。
如果是95~100分，送自行车一辆
如果是90~94分，游乐场一天
如果80~89分，送变形金刚一个
如果是80分以下，揍一顿
 */
public class test09 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);
        System.out.println("请录入一个整数，表示小明的成绩");
        int score = qj.nextInt();
if(score <= 100 && score > 0) {
    if (score >= 95 && score <= 100) {
        System.out.println("送自行车一辆");
    } else if (score <= 94 && score >= 90) {
        System.out.println("奖励游乐场一天");
    } else if (score <= 89 && score >= 80) {
        System.out.println("奖励变形金刚一个");
    } else {
        System.out.println("奖励揍他一顿");
    }
}else{
    System.out.println("请输入合法的分数");
}
    }
}
