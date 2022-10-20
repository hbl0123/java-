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
}
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
//复制数组
//需求： 定义一个方法copyOfRang(int[] arr,int from, int to)
//功能： 将数组arr中从索引form(包含form)开始。
//      带索引to结束（不包含to）的元素复制到新数组中，将新数组返回
public class test26 {
    public static void main(String[] args) {
        int []arr = {12,22,33,44,55};
      int []arr1 = copyOfRang(arr,2,4);
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i] + "  ");
        }
    }
    public static int[] copyOfRang(int arr[],int from,int to){
        int []newArr =new int[to - from];
        //伪造数组
        int index = 0;

        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}*/
