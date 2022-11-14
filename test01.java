package com.宝贝.String;

import java.util.StringJoiner;

public class test01 {
    public static void main(String[] args) {
        StringJoiner q = new StringJoiner("---");

        q.add("aaa").add("bbb").add("ccc");

        System.out.println(q);
    }
}
