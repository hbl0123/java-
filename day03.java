package com.homeWork.arithmeticoperator;
/*public class day03 {
    public static void main(String[] args) {
        //+
        System.out.println(3+1);
        //-
        System.out.println(3-1);
        //*
        System.out.println(3*1);
        //计算时有小数参与
        System.out.println(3.0000+1);
        System.out.println(3.1-1.2);
        System.out.println(3.0*1.0);
    }
}
//+-*与小学知识一样，但是在计算中出现小数结果会有误差
public class day03{
    public static void main(String[] args)}
    {
        //除法运算
        //结论:1.整数参与运算，结果只能是整数
        //2.小数参与运算，结果又可能不精确
        System.out.println(10/3);
        System.out.println(10.0/3);
        System.out.println(10/2);

        //取模,实际上做的是除法运算，得到的是余数
        System.out.println(10%2);
        System.out.println(10%3);
        //应用：1.判断一个数能否被另一个数整除
            2.判断一个数是否为整数
            3.斗地主发牌


//练习，数值拆分
public class day03{
    public static void main(String[] args) {

    }
}


//算术运算     数字相加(数字进行运算时，数据类型不一样的时候不能运算，需要转换成一样的，才能运算)
//转换方式     1。隐式转换（小->大）                           2.强制转换（大->小）
//隐式转换的规则：（1）小的先会变成大的再运算  （2）byty,short,char三种类型再运算的时候，都会先生成int,然后在进行运算（byte<short<int<long<float<double）
public class day03 {
    public static void main(String[] args) {

    }

//强制转换：   格式 ： 目标数据诶性 变量名 = （目标数据类型） 被强制转换的数据
//Eg:
public class day03{
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 10;
        byte result =(byte)(b1 + b2);
        System.out.println(result);
    }
}


//字符串相加:    1.当“+”操作符出现在字符串中，这个"+"是字符串的连接符，前后数据会进行拼接。
//             2.连续进行"+"操作时，从左到右逐个执行。
//Eg
public class day03{
    public static void main(String[] args) {
        int age = 18;
        System.out.println("我的年龄是" + age + "岁");
        System.out.println("我的年龄是" + "age" + "岁");
        System.out.println( 1 +2+ "abc" + 2 + 1);//对了
    }
}

//字符相加规则： 当（字符+字符）/（字符+数字）时，会把字符通过ASCII码表查询到对应的数字在进行计算
public class day03{
    public static void main(String[] args) {
        System.out.println("abc"+'a');
        System.out.println(10+'a');
    }

}

//自增运算符 (++)、(--)
//1.++和--无论是放在变量的前面还是后面，单独写一行结果是一样
//2.参与运算与（C语言）中的一样
public class day03 {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
    }
}

//赋值运算符
//关系运算符 Eg：
//逻辑运算符1.&(并且)、2.|（或者） 3.^(逻辑异或) 4.！（取反）不要多写，要么不写，要么写一次
public class day03{
    public static void main(String[] args) {
        //相同为FALSE，不同为TRUE
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        System.out.println(true ^ false);
    }
}
//短路逻辑运算符（&&）、（||）。具有短路效果，即：当左边的表达式能确定最终结果，那么右边的就不会参与运行了
//&.|,无论左边是true,false,右边都要执行
public class day03 {
    public static void main(String[] args) {
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);

        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);//false
        System.out.println(a);//11
        System.out.println(b);//10

    }
}
 */
//三元运算符    作用：可以进行判断，根据判断的结果得到不同的内容
//            格式：关系表达式？表达式（true）：表达式(false)；
public class day03{
    public static void main(String[] args) {
    //需求： 使用三元运算符，获取两个数中较大的数；
        int number1 = 10;
        int number2 = 20;
        int result = number1 < number2 ? number1 : number2;
        System.out.println(number1 < number2 ? number1 : number2);
        System.out.println(result);
    }
}

