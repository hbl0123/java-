package com.homeWork.test;

import java.util.Random;

/*请创建一个长度为6的整数数组，并为数组中的元素赋值。遍历数组，打印所有元素，元素之间用空格隔开。比如：
        ```
        数组为：{1,2,3,4,5}
        打印结果：1 2 3 4 5
        ```
import java.util.Random;
public class test22 {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

//现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。
public class test22 {
    public static void main(String[] args) {
        double []arr = {12.9,53.54,75.0,99.1,3.14};

        double temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < temp){
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
}
 */
//创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
public class test22 {
    public static void main(String[] args) {
        int []arr = new int[6];

        Random qj = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = qj.nextInt(101);
            arr[i] = number;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
