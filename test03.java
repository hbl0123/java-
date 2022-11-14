package com.宝贝.String;

public class test03 {
    public static void main(String[] args) {
        StringBuilder q = new StringBuilder();
        //容量：
        //长度：
        System.out.println(q.capacity());
        System.out.println(q.length());

        q.append("abcdefghijklmnopqvstuvwsyz0123456789");

        System.out.println(q.capacity());
        System.out.println(q.length());
    }
}
