package 封装;

import java.io.File;

public class StudentTest {
    public static void main(String[] args) {

        Student qj = new Student("nihao",18);

        System.out.println(qj.GetName());
        System.out.println(qj.GetAge());
    }
}
