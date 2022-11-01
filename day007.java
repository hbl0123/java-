package com.宝贝.arithmeticoperator;
//面向对象： 拿东西过来做对应的事情
//（1）学习获取已有的对象并使用   （2）学习如何自己设计对象并使用 ———— 面向对象的语法
//一、设计对象并使用  （1）类和对象  （2）类的几个补充注意事项
//                  类（设计图）： 是对象共同特征的描述
               //   对象： 是真实存在的具体东西
/*    public class 类名{
        1.成员变量（代表属性，一般为名词）
        2.成员方法（代表行为，一般为动词）
        3,构造器（）
        4.代码块
        5.内部类
    }
    定义类的不成注意事项：
    1.用来描述一类事物的类，专业叫做：javabean类。
     在javabean类中，是不写main方法的
    2.在以前，编写mian方法的类，叫做测试类。
     我们可以在测试类中创建javabean类的对象并进行赋值调用
 */
public class day007{
        //属性
        String brand;
        double price;

        //行为：
        public void call(){
            System.out.println("手机在打电话");
    }

        //
    public void playGame() {
        System.out.println("手机在玩游戏");
    }
}
