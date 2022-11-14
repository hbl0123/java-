package com.宝贝.String;

import java.util.Scanner;

//罗马数字：
    /*
    键盘录入一个字符串
    要求1： 长度为小于等于9
    要求2： 只能是数字
    将内容变成罗马数字
    下面是阿拉伯数字跟罗马数字的比较关系：
    1 - 1 、 || - 2、||| - 3、|V - 4、V - 5、V| - 6、V|| - 7、V||| - 8、|X - 9
    注意点：
    罗马数字里面是没有0的
    如果键盘录入的数字包裹0，可以变成“”（长度为0的字符串）
     */
public class test04 {
    public static void main(String[] args) {
        //1.键盘录入
       Scanner q = new Scanner(System.in);
       //定义一个数组来存放字符串；
        int []arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            int number = q.nextInt();
            arr[i] = number;
        }
        //新建一个StringBuilder,将数组变成字符放进去
        StringBuilder qj = new StringBuilder();
        qj.append(arr);
        System.out.println(qj);
    }

}
