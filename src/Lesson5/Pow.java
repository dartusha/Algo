package Lesson5;

public class Pow {

    public static int power(int val, int pow){
        if (pow==0) return 1;
        if (pow%2==1) return val*power(val,pow-1);
        else
        return power(val,pow/2)*power(val,pow/2);
    }

    public static void main(String[] args) {
        System.out.println(power(2,10));
        System.out.println(power(13,2));
        System.out.println(power(2,0));
    }
}
