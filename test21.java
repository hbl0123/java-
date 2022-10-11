package com.homeWork.test;

import java.util.Random;

//需求： 定义一个数组，存入1,2，3,4,5.按照要求交换索引对应的元素
//交换前：1,2.3,4,5,
//交换后：5,2,3,4,1
/*
public class test21 {
    public static void main(String[] args) {
    int arr[] ={1,2,3,4,5};

        for (int i = 0, j = arr.length - 1 ; i < j;i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
 */
//需求： 定义一个数组，存入1~5，要求打乱数组中所有数据的顺序
public class test21 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        Random qj = new Random();

        for (int i = 0; i < arr.length; i++) {
            int number = qj.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[number];
            arr[number] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
}
