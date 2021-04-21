package day_36_methods_with_return;

import static com.sun.tools.doclint.Entity.divide;
import static day_36_methods_with_return.Calculator.*;

public class Calculations {
    public static void main(String[] args) {
        System.out.println(multiplication(100,50));
        System.out.println(divide(25,11));
        System.out.println(add(35,67));

        double d1=234.3;
        double d2=321.5;

        double result=Calculator.minus(d1,d2);
        System.out.println("result = "+result);


    }



}
