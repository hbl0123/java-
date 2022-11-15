package com.宝贝.作业;

public class StudentTest {
    public static void main(String[] args) {
        Student q = new Student(154,"w","男",19,90);
        Student j = new Student(123,"j","女",19,91);

        double  average =(q.getSJava() + j.getSJava()) / 2;
        System.out.println("这两个学生java的平均值是" + average);


        Student []arr = new Student[5];

        arr[0] = new Student(154,"w","男",17,91);
        arr[1] = new Student(153,"y","男",18,92);
        arr[2] = new Student(152,"f","男",19,93);
        arr[3] = new Student(151,"j","女",18,94);
        arr[4] = new Student(150,"j","女",19,95);

        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = 0; k < arr.length - 1 - i; k++) {
               if(arr[k].getSJava() < arr[k + 1].getSJava()) {
                   Student temp = arr[k];
                   arr[k] = arr[k+1];
                   arr[k + 1] = temp;

               }
            }
        }
        System.out.println("java最大值" + arr[arr.length - 1].getSJava());
        System.out.println("java最小值" + arr[0].getSJava());


    }
}