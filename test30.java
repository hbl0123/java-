package com.宝贝.test;
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
        int []arr = {1,9,8,3};
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = arr[i] + 5;
        }
        //在对 10 求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //将数字反转
        for (int i = 0, j = arr.length - 1;i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int number = 0;
        //3.把数组里面的每一个数字进行拼接，变成加密的结果
        for (int i = 0; i < arr.length; i++) {
           number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
