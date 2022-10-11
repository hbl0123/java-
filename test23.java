package com.homeWork.test;

import java.util.Random;
import java.util.Scanner;

/*现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，从数组的最大索引位置开始到最小索引位置，依次表示整数的个位、十位、百位。。。依次类推。
        请编写程序计算，这个数组所表示的整数值。例如：
        数组：{2, 1, 3, 5, 4}
        表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。
public class test23 {
    public static void main(String[] args) {
        int []arr={3,4,5,6,7,8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum * 10 +arr[i] ;
        }
        System.out.println(sum);
    }
}
//定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。
public class test23 {
    public static void main(String[] args) {
        int []arr = {72,89,65,87,91,82,71,93,76,68};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum/10);
    }
}

 有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
 再通过键盘录入一个整数数字。要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。
 执行效果如下：

请输入一个整数数字：
50
生成的新数组是：12 14 23 45 50 66 68 70 77 90 91
```
 */
public class test23 {
    public static void main(String[] args) {
        //1.定义长度为10的原数组
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        //2.定义长度为11的空数组
        int[] brr = new int[11];
        //3.键盘录入数组
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数数字");
        int num = sc.nextInt();
        //4.定义变量代表要插入的位置
        int index = 0;
        //5.循环遍历原数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= num) {
                //5.1如果元素小于等于要插入的数字，则直接存放
                brr[i] = arr[i];
                //5.2把i后面的位置记录下来
                index = i + 1;
            } else {
                //5.3如果元素大于要插入的数字,则往后一个位置存放
                brr[i + 1] = arr[i];
            }
        }
        //6.index存储的就是要插入的位置
        brr[index] = num;
        //7.遍历新数组查看结果
        System.out.print("生成的新数组是：");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
//定义一个数组其中包含多个数字。用自己的方式最终实现，
// 奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）