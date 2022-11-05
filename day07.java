package com.宝贝.学习天数;
//目的： 复习前半段课程学习的java编程知识，能够使用所学的知识解决问题，提升能力
//二维数组的动态初始化
//格式 ： 数组类型[][]数组名 = new数组类型[M][N]
//注释    M表示这个二维数组，可以存放多少个一维数组
//       N表示每一个一维数组，可以存放多少个元素


//二维数组： 当我们需要把数据分组管理的时候，就需要用到二维数组
//格式： 数组类型[][]数组名 = new数组类型[][]{{元素1，元素2}，{元素1，元素2}}；
//       int [][]arr={{元素1，元素2},{元素1，元素2}}；   int arr[][]={{元素1，元素2},{元素1，元素2}}；
/*public class day07 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };
        System.out.println(arr[0]);//表示获取二维数组中第一个一维数组的地址
        System.out.println(arr[1][4]);
        //遍历二维数组的所有元素
        //外循环：遍历二维数组，得到里面中的每一个一维数组
        for (int i = 0; i < arr1.length; i++) {
            //i表示二维数组中的每一个索引
            //arr1[i]:表示二维数组钟大哥每一个元素（一维数组）
            //内循环： 遍历一维数组，得到里面的每一个元素
            for (int j = 0; j < arr1[i].length; j++) {
                //j: 表示一维数组的每一个元素
                System.out.print(arr1[i][j] +"  ");
            }
            System.out.println();
        }
    }
}


public class day07 {
    public static void main(String[] args) {

        //表示二维数组的长度为3 ，可以装3个一维数组
        //表示每一个一维数组的长度都是5，可以装5 个int类型的元素
        int [][]arr = new int[3][5];
        arr[0][0] =10;
        //外循环
        //内循环
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]  + "  ");
            }
            System.out.println();
        }
    }
}
 */
//转test29
