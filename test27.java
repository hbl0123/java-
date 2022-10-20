package com.homeWork.test;
/*
public class test27 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number);
        change(number);
        System.out.println("调用change方法之后：" + number);
    }
    public static void  change(int number){
        number = 20;
    }
}
public class test27 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number);
        number = change(number);
        System.out.println("调用change方法之后：" + number);
    }

    public static int  change(int number) {
        number = 20;
        return number ;
    }
}*/
public class test27 {
    public static void main(String[] args) {
        int []arr = {10,20,30};
        System.out.println("调用change方法前：" + arr[0]);
        change(arr);
        System.out.println("调用change方法之后：" + arr[0]);
    }
    public static void  change(int arr[]) {
        arr[0] = 20;
    }
}