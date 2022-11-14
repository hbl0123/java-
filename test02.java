package com.宝贝.String;

import java.util.StringJoiner;

public class test02 {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner q = new StringJoiner(", ", "[", "]");

        //2.添加元素
        q.add("aaa").add("bbb").add("ccc");


        int length = q.length();
        System.out.println(length);

        //3,。打印
        System.out.println(q);

        String str = q.toString();
        System.out.println(str);
    }
}
