package com.宝贝.test;

public class girlFriendTest {
    public static void main(String[] args) {
        //常见女朋友的对象
        girlFriend q = new girlFriend();
        q.name = "佳佳";
        q.age = 18;
        q.height = 163;
        System.out.println(q.name);
        System.out.println(q.age);
        System.out.println(q.height);

        q.sleep();
        q.playGame();

        System.out.println("============================");
        girlFriend j = new girlFriend();
        j.name = "小佳佳";
        j.age = 18;
        j.height = 163;
        System.out.println(j.name);
        System.out.println(j.age);
        System.out.println(j.height);

        j.sleep();
        j.playGame();
    }
}
