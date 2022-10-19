package com.homeWork.arithmeticoperator;
//什么是方法         程序中最小的执行单元
//       优点：提到代码的复用性  提到代码的可维护性


//方法的定义格式：
//          最简单的方法定义和调用                         带参数的犯法定义和调用
//         格式： public static void 方法名(){            格式：public static void 方法名（参数1，参数2，参数3.。。）{...}
//                     方法体 （打包起来的代码）；}
//         调用： 方法（）                             调用：方法名（参数，参数2，参数3.。。）

//带返回值的方法定义和调用：
//public class 返回类型 方法名（参数）{
//          方法体；
//          return 返回值；
//}
//  直接调用： 方法名（实参）
//  赋值调用： 整数类型 变量名 = 方法名（实参）；
//  输出调用： System.out.println(方法名（实参）)；

//形参：全称形式参数，是指方法 定义 中的参数
//实参：全称实际参数，是指方法 调用 中的参数

//注意： 1.方法不调用不执行
//      2.方法与方法之间是平级关系，不能相互嵌套定义
//      3.方法的编写顺序与执行顺序无关
//      4.方法的返回类型为void ，表示该方法没有返回值。
//       没有返回值的方法可以省略return语句不写
//       如果要编写return，后面不能跟具体的数据
//      5.return语句下面，不能编写代码，因为永远执行不到，属于无效代码

/*public class day06 {
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
public class day06 {
    public static void main(String[] args) {
        number(10,30);
    }

    public static void number(int number1,int number2) {
        int result = number1 + number2;
        System.out.println(result);
    }
}
 */
//方法的重载 ： 1.同一个类中，方法名相同，2.参数不同的方法。与返回值无关
//           参数不同：个数不同，类型不同，顺序不同
public class day06 {
    public static void main(String[] args) {

    }
}
