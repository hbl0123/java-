package com.homeWork.test;

import java.util.Random;

//需求： 已知数组元素为{33,5,22,44,55,}
//请找出数组中最大值并打印在控制台
/*public class test20 {
    public static void main(String[] args) {
        int arr[] = {33,5,22,44,55};
        int max = arr[0];//将max定义为数组里面的值，防止数组中全为负数，从而使max的值一直为0
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
 */
//需求： 生成10个1~100之间的随机数存入数组中
//(1)求出所有数据的和
//(2)求出所有数据的平均数
//(3)统计有多少个数据比平均值小
public class test20 {
    public static void main(String[] args) {

    /*    int number1 = qj.nextInt(101);
        int number2 = qj.nextInt(101);
        int number3 = qj.nextInt(101);
        int number4 = qj.nextInt(101);
        int number5 = qj.nextInt(101);
        int number6 = qj.nextInt(101);
        int number7 = qj.nextInt(101);
        int number8 = qj.nextInt(101);
        int number9 = qj.nextInt(101);
        int number10 = qj.nextInt(101); */
        Random qj = new Random();


        int[]arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            int number = qj.nextInt(101);
            arr[i] = number;
        }
        int sum = 0;

//        int arr[] = {number1,number2,number3,number4,number5,number6,number7,number8,number9,number10,};

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
 //           System.out.print("   " + number);
        }
        System.out.println();
        System.out.println(sum);

     /*   System.out.print( number1  );
        System.out.print("   " + number2   );
        System.out.print("   " + number3   );
        System.out.print("   " + number4   );
        System.out.print("   " + number5   );
        System.out.print("   " + number6   );
        System.out.print("   " + number7   );
        System.out.print("   " + number8   );
        System.out.print("   " + number9   );
        System.out.println("   " + number10  );

      */


        double average =  (double)sum / arr.length ;
        System.out.println(average);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(average > arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
