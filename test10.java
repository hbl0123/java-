package com.宝贝.学习天数;


//StringJoiner :
            /* StringJoiner 和 StringBuilder 一样，可以看做一个容器，创建之后里面的内容是可以改变的。
             作用： 提高字符的操作效率，而且代码编写特别简洁，但是市场上很少人使用。
             */

//StringJoiner的构造方法：
     /*         方法名                                                  说明：
         public StringJoiner(间隔符号)                      创建一个StringJoiner对象，指定拼接的间隔符号
         public StringJoiner(间隔符号,间隔符号,间隔符号)       创建一个StringJoiner对象，指定拼接的间隔符号、开始符号、结束符号。

         StringJoiner q = new StringJoiner("---")           1---2---3
         StringJoiner q = new StringJoiner(",","[","]")     [1,2,3]
      */

//StringJoiner的成员方法
    /*         方法名                                                  说明：
         public StringJoiner add(添加内容)                  添加数据，并返回对象本身
         public int length()                               返回长度（字符出现的个数）
         public com.宝贝.String toString()                 返回一个字符串（该字符串就是拼接后的结果）
     */


//字符串的原理；
/*
       1.字符串储存的内存原理：
         直接赋值会复用字符串常量池中的
         new 出来不会复用，而是开辟一个新的空间

       2.==号比较的到底是什么？
        基本数据类型 比较数据值
        引用数据类型 比较地址值

       3.字符串拼接的底层原理
        拼接的时候没有变量参与，都是字符串
            触发字符串的优化机制。
            在编译的时候就已经是最最终结果了

        在拼接的时候有变量参加,
            在内存中创建了很对对象；
            浪费空间，时间也非常缓慢，

       4.StringBuilder 地高效率原理图
           将所有变量放入同一个StringBuilder 中，不会创建很多空间，结余内存

       5.StringBuilder源码分析
            默认容量：16
            如果不够： 扩容：老容量*2 + 2 = 34
            如果扩容之后还不够，以实际长度为准


 */

public class test10 {
}
