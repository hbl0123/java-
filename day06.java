package com.homeWork.arithmeticoperator;
//什么是方法         程序中最小的执行单元
//       优点：提到代码的复用性  提到代码的可维护性


//方法的定义格式：
//          最简单的方法定义和调用                         带参数的犯法定义和调用
//         格式： public static void 方法名(){            格式：
//                     方法体 （打包起来的代码）；}
//         调用： 方法（）                                 调用：
public class day06 {
    public static void main(String[] args) {
        PlayGame();
        PlayGame();
    }
    public static void PlayGame(){
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
    }
}
