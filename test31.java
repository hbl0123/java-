package com.宝贝.test;

import java.util.Scanner;
import java.util.function.Consumer;

/*
//1、定义一个函数，获取某个数组中的最小值。
public class test31 {
    public static void main(String[] args) {
        int [] arr = {3,4,32,2432,4,24,24,1};
        System.out.println(getmin(arr));
    }

    public static int getmin(int []arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[0];
    }
}

//2、定义一个数组,数组成员 10个,找出数组中最大数连同下标一起输出。
public class test31 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,5,6,7,8,9,100};
        System.out.println("下表是" + getMax(arr) +"最大值是" + arr[getmax(arr)] );
    }
    public static int getMax(int []arr){
        int index = 0;
        int i = 0;
        for (; i < arr.length; i++) {
            if(arr[i] > arr[index]){
                index = i;
            }
        }
    return index;
    }
}
//3、利用选择排序对数组进行降序排序。
//定义数组，存放5个学生的成绩【成绩值自己设定】，将成绩从大到小排序，获得成绩之和，平均成绩，最小成绩，最大成绩。
public class test31 {
    public static void main(String[] args) {
        int[] arr = {67, 57, 90, 100, 99};
        getmax(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        getsum(arr);
        double average = getsum(arr)/arr.length;
        System.out.println("成绩之和:" + getsum(arr));
        System.out.println("平均成绩是" +average);
        System.out.println("最小的成绩是：" + arr[arr.length - 1]);
        System.out.println("最大的成绩是：" + arr[0]);
    }

    private static int getsum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum = sum + arr[i];
        }
        return sum;
    }

    public static int[] getmax(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
 */
//4、求 1+2!+3!+...+N!的和。
public class test31 {
    public static void main(String[] args) {
        int sum = 1;
        int ret = 0;
        Scanner qj = new Scanner(System.in);
        int N = qj.nextInt();
        for (int i = 1; i <= N; i++) {
            sum = sum * i;
            ret = ret + sum;
        }
        System.out.println(ret);
    }
}