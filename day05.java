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
//      2.把数据存储到数组中        格式： 数组名[索引] = 具体变量/变量        细节：一旦覆盖之后，原来的数据就不存在了
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
public  class day5 {
    public static void main(String[] args) {
        int arr[] = {1,6,3,1,7,8};
        int number = arr[0];
        System.out.println(number);
        System.out.println(arr[2]);

        arr[1] = 9;
        System.out.println(arr[1]);
    }
}
//数组的遍历： 将数组中的所有内容取出来，取出来之后可以（打印，求和，判断...）
public class day5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
//
  //      for(int i = 0; i <= 3; i++){
  //          System.out.println(arr[i]);
//在java中，关于数组的一个长度属性，length
            //调用方式： 数组名.length
     //   }
        System.out.println(arr.length);

//扩展:
//自动的快速生成数组的遍历方式
//idea 提供的
// 数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
//数组的动态初始化
//动态初始化：初始化时指定数据长度，有系统为数组分配初始值
//     格式： 数组类车型[]数组名 = new 数组类型[数组长度]
//数组默认初始值的规律：
//整数类型： 默认初始值0
//小数类型： 默认初始值0.0
//字符初始值：默认初始值’/u0000‘空格
//布尔类型： 默认初始值 false
//引用数据类型：默认初始值 null
//
public class day5 {
    public static void main(String[] args) {
        String arr[] = new String[50];
        arr[0] = "你好";
        arr[1] = "佳佳";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
 */
//数组常见的问题
//1. 当访问了数组中不存在的索引，就会引发索引越界异常
