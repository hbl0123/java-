package com.homeWork.arithmeticoperator;
//数组  ：   数组指的是一种容器，可以用来存储同种数据类型的多个值
//          数组在存放数据的时候，需要结合隐式转换考虑


// 数组的定义：   1. 数据类型[] 数组名           2.数据类型 数组名[]
//                 int [] array                 int array []


//数组的初始化 :   1.数组的静态初始化
//                  完整格式： 数组类型[] 数组名 = new 数组类型[]{元素一，元素二，。。。}；
//                  简化格式： 数组类型[] 数组名 = {}；
//
//
//索引： 利用索引对数组中的元素进行访问
//      1.获取数组里面的元素        格式： 数组名[索引]
//      2.把数据存储到数组中
//
/*
public class day5 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{13,43,43,23,};
        int[] arr2 = {32,34,54,};

        String[] arr3 = new String[]{"你好","佳佳"};
        String[] arr4 = {"你好呀","佳佳宝宝"};

        double[] arr5 = new double[]{178,163};
        double[] arr6 = {163,178};

        System.out.println(arr6);//[D@16b98e56  地址值
        //  扩展：
        //  [ : 表示当前是一个数组
        //  D ； 表示当前数组里面的元素都是 double 类型的
        //  @ ； 表示一个间隔符号（固定格式）
        //  16b98e56 : 才是数组真正的地址值。（十六进制）
    }
}
 */
public  class day5 {
    public static void main(String[] args) {
        int arr[] = {1,6,3,1,7,8};
        int number = arr[0];
        System.out.println(number);
    }
}