package com.宝贝.test;

import java.util.Scanner;

/*数字加密
需求： 某系统的数字密码（大于0），比如 1983，采用数字加密的方式进行传输
规则如下： 先得到每位数，
         然后每位数都加上5，
         再对10求余，
         最后将所有的数字反转，得到一串新数
 */
public class test30 {
    public static void main(String[] args) {
        //把整数上的每一位都添加到数组当中
        Scanner qj = new Scanner(System.in);
        int number = qj.nextInt();
        //定义一个临时变量记录number的值，就是为了第三部的时候再次使用
        int temp = number;
        //定义一个变量进行统计
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);

        int[] arr1 = new int[count];
//定义一个变量表示索引
        int index = arr1.length - 1;
        while (temp != 0) {
            int ge = temp % 10;
            temp = temp / 10;
            arr1[index] = ge;
            index--;
        }

        for (int i = 0; i < arr1.length; i++) {
           arr1[i] = arr1[i] + 5;
           arr1[i] = arr1[i] % 10;
        }
        for (int i = 0,j = arr1.length - 1; i < j; i++,j--) {
            int temp1 = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp1;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
/*      for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //在对 10 求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //将数字反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp1 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp1;
        }
        int number1 = 0;
        //3.把数组里面的每一个数字进行拼接，变成加密的结果
        for (int i = 0; i < arr.length; i++) {
            number1 = number1 * 10 + arr[i];
        }
        System.out.println(number1);
    }
}
*/
