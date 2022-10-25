package com.宝贝.test;

/* 某商城每一个季度的营业额如下： （单位：万元）
    第一季度：22，66,44
    第二季度：77,33,88,
    第三季度：25,45,65，
    第四季度：11,66,99
    要求： 计算出每一个季度的总营业额和全年的总营业额

public class test28 {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        for (int i = 0; i < arr.length; i++) {
            int[] quarterArr = arr[i];
            int sum = getSum(quarterArr);
            System.out.println(sum);
        }
    }

    public static int getSum(int arr1[]) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }
        return sum;
    }
}
public class test28 {
    public static void main(String[] args) {
        char[] anSwer ={'D','B','D','C','C','D','A','E','A','D'};
        char [][]Student ={
                {'A','B','A','C','C','D','E','E','A','D'},
                {'D','B','A','B','C','A','E','E','A','D'},
                {'E','D','D','A','C','B','E','E','A','D'},
                {'C','B','A','E','D','C','E','E','A','D'},
                {'A','B','D','C','C','D','E','E','A','D'}
        };

        for (int i = 0; i < Student.length; i++) {
            char[] St = Student[i];
            score(anSwer,St);
            System.out.println(score(anSwer,St));
        }
    }
    public static int score(char[] anSwer, char[] St){
        int number = 0;
        for (int i = 0; i < St.length; i++) {
            if(anSwer[i] == St[i]){
                number++;
            }
        }
        return number;
    }
}
public class test28 {
    public static void main(String[] args) {
        char [][]arr = {
                {'春','眠','不','觉','晓'},
                {'处','处','闻','啼','鸟'},
                {'夜','来','风','雨','声'},
                {'花','落','知','多','少'}
        };
        int k =1;
        for (int i = 0; i < arr.length; i++) {
            char[] arr1 = arr[i];
            arr[1][4] = '猫';
            pr(arr1,k);
            k++;
        }
    }
    public static void pr(char[]arr1,int k){
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        if(k % 2== 0){
            System.out.println("。");
        }else {System.out.println("，");}
    }
}

 */
public class test28 {
    public static void main(String[] args) {
        int[] A = {1, 7, 9, 11, 13, 15, 17, 19};
        int[] B = {2, 4, 6, 8, 10};
        nihao(A, B);
    }

        public static void nihao ( int[] A, int[] B){
            int[] C = new int[A.length + B.length];
            for (int i = 0; i < A.length; i++) {
                C[i] = A[i];
            }
            for (int i = 0; i < B.length; i++) {
                C[i + A.length] = B[i];
            }
            for (int i = 0; i < C.length - 1; i++) {
                for (int j = 0; j < C.length - 1 - i; j++) {
                    if (C[j] > C[j + 1]) {
                        int temp = C[j];
                        C[j] = C[j + 1];
                        C[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < C.length; i++) {
                System.out.print(C[i] + "  ");
            }
        }
}
