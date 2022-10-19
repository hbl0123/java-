package com.homeWork.test;

import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        int []array = {12,34,234,53,132};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("最大值" + max);
    }
}