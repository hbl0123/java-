package com.宝贝.String;
//拼接字符串
/*
    定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回。
    调用该方法，并在控制台输出结果。
    例如：
        数组为int[] arr = {1,2,3};
        执行方法后的输出结果为： [1,2,3]
 */
/*
public class test05 {
//利用 StringBuilder
    public static void main(String[] args) {
        //定义一个数组arr
        int [] arr = {1,2,3};

        StringBuilder qj = new StringBuilder();
        qj.append("[").append(arr[0]).append(",").append(arr[1]).append(",").append(arr[2]).append("]");

        System.out.println(qj);
    }
}
 */
//利用方法：
/*
public class test05 {
    public static void main(String[] args) {

        int []arr = {1,2,3};

        System.out.println(Get(arr));

    }
    public static String Get(int []arr){
        if(arr.length == 0){
            return "[";
        }

        if(arr == null) {
            return "";
        }

        String  result = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                result = result + arr[i];
            }else{
                result = result + arr[i] + ", ";
            }
        }
        result = result + "]";
        return result;
    }
}
 */
//字符串反转
/*
    定义一个方法，实现字符串反转
    键盘录入一个字符，调用该方法之后，在控制台输出结果
    例如，键盘录入abc, 输出结果 cba

 */

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        String []arr= new String[3];

        for (int i = 0; i < arr.length; i++) {
            String n = q.next();
            arr[i] = n;
        }

        Get(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
    public static String[] Get(String []arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}