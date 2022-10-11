package com.homeWork.test;
/*需求：
      给定两个整数，被除数和除数（都是正数，且不超过Int的范围）
      将两个数相除，要求不使用乘法、除法和%运算符
      得到商和余数
 */
//解题思路：用这个数一直（—10），剩下的就是余数
//          减去10 的次数就是商；
public class test13 {
    public static void main(String[] args) {
        int dividend = 101;//被除数
        int divisor = 10;//除数
        int number = 0;
        while(dividend > divisor){
            dividend = dividend - divisor;
            number++;
        }
        System.out.println("余数是：" + dividend);
        System.out.println("商为："+number);
    }
}