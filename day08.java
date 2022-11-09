package com.宝贝.学习天数;
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
//类名首字母建议大写，需要见名知意，驼峰模式
//一个java文件可以定义多个class类，且只能有一个类是public修饰，
//而且public修饰的类名必须成为代码文件名
//实际开发中建议还是一个文件定义一个class类
//成员变量的完整定义格式是： 修饰符 数据类型 变量名称 = 初始化值；一般无需制定初始化值，存在默认值

//对象的成员变量的默认值规则：
// byte、short、int、long     0
//float 、double             0.0
//boolean                    false
//  类，接口，数组，String      null

//  注意： 1.定义类的建议有哪些？ 有什么需要注意的？
//        类名首字母建议大写，英文，瞒住驼峰模式，不能用关键字，满足标识符规定
//        一个代码文件中可以有多个类，但是只能有一个类是public修饰的，
//        public修饰的类名必须是java代码文件名称
//        2.成员变量的格式是什么样的，有什么特点？
//          成员变量的完整定义格式是： 修饰符 数据类型 变量名称 = 初始化值；一般无需制定初始化值，存在默认值
//           一般无需指定初始化值


//this关键字；com.宝贝.封装（GirlFriend）
//      1.就近原则：
//      System.out.print(age);
//      System.out.print(this.age);
//      2.this的作用？
//          可以区分成员变量和局部变量
//      3.
//
//



//构造方法概述：
//      构造方法也叫做构造器，构造函数。
//   作用：在创建对象的时候，虚拟机会自动调用构造方法，作用是给成员变量进行 初始化 的
//
/*构造方法的格式：
public class Student{
    修饰符  类名（参数）{
        方法体；
    }
}
特点： 1.方法名与类名相同，大小也要一致
      2.没有返回值类型，连void都没有
      3.没有具体得返回值（不能由return带回结果数据）

执行时机：
      1.创建对象的时候由虚拟机调用，不能手动调用构造方法；
      2.没创建一个对象，就会调用一次构造方法；

构造方法的注意事项：
    1.构造方法的定义：
        （1）如果没有定义构造方法，系统会给出一个默认的无参数构造方法；

        （2）如果定义了构造方法，系统将不会提供默认的构造方法

    2.构造方法的重载：
      （1）带参数构造方法，和无参数构造方法，两者方法名相同，但是参数不同，这叫做构造方法的重载

    3.推荐的使用方式：
        （1）无论是否使用，都手动书写无参数构造方法，和带全部参数的构造方法
*/


//com.宝贝.封装：对象代表什么，就得封装对应的数据，并提供对应的行为


//标准javaBean类：
/*
    1.类名需要见名知意
    2.成员变量使用private修饰
    3.提供至少两个构造方法
        （1）无参数构造法
        （2）带全部参数的构造方法
    4.成员变量
        （1）提供每一个成员变量对应的setXxx()/getXxx()
        （2）如果还有其他行为，也需要写上。
 */

//java 的内存分配介绍：（栈，堆，方法区）
/*
    一个对象的内存图：
        1.加载class文件
        2.申明局部变量
        3.在堆内存中开辟一个空间
        4.默认初始化
        5.显示初始化
        6.构造方法初始化
        7.将堆内存中的地址值赋值给左边的局部变量

    两个对象的内存图：（栈，堆，方法区）
       类比一个对象的内存图 ，在此基础上，在 堆内存 再次创建一个空间
       （两个小空间是完全相互独立的）

    两个引用指向同一个对象
        即：两个变量指向同一个空间。
 */

//基本数据类型和引用数据类型
/*
    基本数据类型： 数据值是存储在自己的空间中
        特点：赋值给其他变量，也是赋的真实值

    引用数据类型： 数据值是存储在其他的空间中，
                 自己空间中存储的是地址值。
        特点： 赋值给其他变量，赋的地址值

 */

// this的内存图：
/*
    this的作用：区分局部变量和成员变量

    this的本质：所在方法调用者的地址值
 */

//成员变量与局部变量的区别：
/*
成员变量：  类中的方法外的变量
局部变量：  方法中的变量；
 */


public class day08 {
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


