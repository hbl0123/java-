package 封装;

public class Student {
    private String name;
    private int age;

    //如果我们自己没有写任何的构造方法
    //那么虚拟机给我们加一个空参构造方法
public Student(String name,int age){
    this.age =age;
    this.name = name;

}

    public String GetName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int GetAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
