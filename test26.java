package com.homeWork.test;
//数组的遍历
//需求： 设计一个方法用于数组的遍历，要求便利的结果是在一行上的，例如：[11,23,33,44,55,]
/*public class test26 {
    public static void main(String[] args) {
        array();
    }
    public static void array(){
        int[] arr ={11,23,33,44,55};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//需求： 设计一个方法求数组的最大值，并将最大值返回
public class test26 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,43,54,65};
        getMax(arr);
    }
    public static void getMax(int [] arr){
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[0]){
                Max = arr[i];
            }
        }
        System.out.println(Max);
    }
}*/
// 需求; 定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
public class test26 {
    public static void main(String[] args) {
        int [] arr ={1,5,8,12,56,89,34,67};
        System.out.println(Getnumber(arr));
    }
    public static boolean Getnumber(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 34){
               return true;
            }
        }
        return false;
    }
}