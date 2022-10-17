package com.homeWork.test;
//展示女朋友的信息
//需求： 定义一个方法，在方法内部打印女朋友的所有信息
/*public class test25 {
    public static void main(String[] args) {
        Girlfriend();
    }
    public static void Girlfriend(){
        System.out.println("jaijia");
    }
}
//需求： 定义一个方法，在方法内部定义两个变量
//      求出他们的和并进行打印
public class test25 {
    public static void main(String[] args) {
        number1();
    }
    public static void number1(){
        int number01 = 10;
        int number02 = 20;

        int result = number01 + number02;
        System.out.println(result);
        }
}

//需求： 定义一个方法，求长方形的周长，将结果在方法中进行打印

public class test25 {
    public static void main(String[] args) {
        perimeter(12,34);
    }

    public static void perimeter(double len,double width){
            double result = (len + width) * 2;
            System.out.println(result);
    }
}
//需求： 定义一个方法，求○的面积，将结果在方法中进行打印
public class test25 {
    public static void main(String[] args) {
        area(3.4);
    }

    public static void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println(result);
    }
}

//需求：

public class test25 {
    public static void main(String[] args) {
        double sum1 = sum(321432,43242,434343);
        double sum2 = sum(32,43,434);
    }
    public static double sum(double num1,double num2,double num3){
        double result = num1 + num2 + num3;
        return  result;
    }
}*/

//定义方法，比较两个长方形的面积
public class test25 {
    public static void main(String[] args) {
        double area1 = area(12,3);
        double area2 = area(34,4);

        System.out.println(area2);
        System.out.println(area1);
        System.out.println(max(area1,area2));
    }
    public static double area(double a,double b){
        double result = a * b;
        return result;
    }
    public static double max(double a, double b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}