package com.homeWork.test;
//定义一个数组，存储1,2,3,4,5
//遍历数组得到每一个元素，求数组里面所有的数据和
/*public class test19 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
//定义一个数组，存储1,2,3,4,5,6,7,8，9,10
//遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字
public class test19 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int q = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0){
                q++;
                System.out.println(arr[i]);
            }
        }
        System.out.println(q);
    }
}
 */
// 定义一个数组，存储1,2,3,4,5,6,7,8,9,10
//遍历数组得到每一个元素
//要求   1.如果是奇数，则将当前的数字扩大两倍       2.如果是偶数，则将当前的数字变成二分之一
public class test19{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
            }else{
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }
}