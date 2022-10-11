package com.homeWork.test;

import java.util.Scanner;

/*练习       你和你的约会对象在餐厅里面正在约会
            键盘录入两个整数，表示你和你对象衣服的时髦程度。（手动录入1~10之间的帧数，不能录其他）
            如果你的时髦程度大于你的对象，相亲成功，输出true;
            否则输出false。
 */
public class test02 {
    public static void main(String[] args) {
        Scanner qj = new Scanner(System.in);
        System.out.println("请输入自己衣服的时髦程度");
        int myFashion = qj.nextInt();
        System.out.println("请输入相亲对象衣服的时髦程度");
        int girlFashion = qj.nextInt();

        boolean result = myFashion > girlFashion;

        System.out.println(result);
    }
}
