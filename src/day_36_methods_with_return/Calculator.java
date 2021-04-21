package day_36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(5,5));
        double result=add(8.9,7.8);
        System.out.println(result+" - result");

        System.out.println(minus(34,23));
        System.out.println(multiplication(66,77));
        System.out.println(divide(100,50));
    }
    public static double add(double num1,double num2){
        double sum=num1+num2;
        return sum;
        }
        public static double minus(double num1, double num2){
        double sum=num1-num2;
        return sum;
        }
     public static double multiplication(double num3, double num4) {
        double result = num3 * num4;
        return result;
     }
     public static double divide(double num1, double num2){
        double result=num1/num2;
        return result;
     }
        }



