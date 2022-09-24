package com.homeWork.arithmeticoperator;
//流程控制语句  1、顺序语句     2、分支语句（IF、Switch）   3、循环语句

//if语句: 格式：1、if（关系表达式）{             2、if(关系表达式){
//                   语句体;}                     语句体1；}else{
//                                                     语句体2；}
//if 使用时应注意：1、大括号的开头可以另起一行书写，但是建议写在第一行的末尾
//              2、如果语句体中只有一句代码，大括号可以省略不写。建议，大括号还是不要省略
//              3、如果对一个布尔类型的变量进行判断，不要用==号，直接把变量写在小括号中。
import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
//需求：键盘录入女婿的酒量，如果大于2斤，老丈人给出回应，反之不回应
       Scanner qj = new Scanner(System.in);
        System.out.println("亲输入女婿的酒量");
        int wine = qj.nextInt();
        if(wine > 2){
            System.out.println("小伙子，不错哦！！");}

         boolean flag = true;
         if(flag){
             System.out.println("flag的值为true");}
        }
}
