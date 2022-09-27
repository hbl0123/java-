package com.homeWork.arithmeticoperator;
//流程控制语句  1、顺序语句     2、分支语句（IF、Switch）   3、循环语句

//if语句: 格式：1、if（关系表达式）{             2、if(关系表达式){                    3、if（）{
//                   语句体;}                     语句体1；}else{                         }if else{
//                                                     语句体2；}                              }
//                                                                                        else{}
//if 使用时应注意：1、大括号的开头可以另起一行书写，但是建议写在第一行的末尾
//              2、如果语句体中只有一句代码，大括号可以省略不写。建议，大括号还是不要省略
//              3、如果对一个布尔类型的变量进行判断，不要用==号，直接把变量写在小括号中。
import java.util.Scanner;
/*
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
}*/
/*
switch(表达式){
    case 值1:
        语句体1；
        break;
    case 值2:
        语句体2；
        break；

    default;
            语句体 n+1;
            break;
}*/ /*
public class day4 {
    public static void main(String[] args) {
        String noodles = "兰州拉面";
        switch(noodles){
            case"兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case"武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case"北京杂酱面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃泡面吧你！！！");
                break;
        }
    }
}
*/
//switch的扩展知识点和练习     1、default的位置和省略
//                         （1）位置：default 不一定要写在最下面，我们可以写在任意位置，只不过习惯会写在最下面
//                         (2)省略：default 可以省略不写，语句不会有问题，但是不建议省略。
//                         2、case穿透：语句体中没有写break导致的
//                          首先还是拿着小括号中的表达式的值跟下面的每一个case进行匹配
//                          如果匹配上了，就会执行对应的语句体，如果此时发现了break，那么就结束整个Switch语句，
//                          如果没有发现break，那么程序就会继续执行下一个case语句体，一直遇到break或者右大括号为止
/*                      3、Switch新特性  ：代替 ->   {} 代替 break

 */
//循环语句
//1.for(初始化语句；条件判断语句；条件控制语句){            2.初始化语句                        3.do...while语句
//                                                     while(条件判断语句){
//                     循环体语句 ；+}                      循环体语句；
//                                                       条件控制语句；}
//
//扩展小点：1.求和的变量不能定义再循环的里面，因为变量值在所属的大括号中有效
//        2.如果我们把变量定义在新换的里面，那么当前的变量只能在本次循环中有效，
//          当本次循环结束以后，变量就会从内存中消失.
//          当地二次循环开始的时候，又会重新定义一个新的变量
/*public class day4 {
    public static void main(String[] args) {
//利用while语句打印1-100
        int i =1;
        while(i < 100){
            System.out.println(i);
            i++;
        }
    }
}
 */
//for和while的对比：
//for循环中：知道循环的次数或者循环的范围
//while循环中不知道循环的次数和范围，只知道循环的结束条件
public class day4 {
    public static void main(String[] args) {

    }
}
