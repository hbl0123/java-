public class test1 {
    public static void main(String[] args) {
        for (int i = 0; i <6 ; i++) {
            int k = ++i;
            while(k < 5){
                System.out.println(i);
                break;
            }
        }
    }
}/*
public class test2{
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            do{
                i++                                                                                                                                        ;
                if(i % 2 != 0)
                    sum+=i;
            }while(i < 6);
        }
        System.out.println(sum);
    }
}
public class test3 {
    public static int GetMul(int number) {
        if(number == 1){
            return 1;
        }else{
            return number * GetMul(number - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(GetMul(4));
    }
}*/
