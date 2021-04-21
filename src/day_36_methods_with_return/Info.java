package day_36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        fullName();
        System.out.println(fullName());
        isMarried();
        System.out.println(isMarried());
        getAge();
        System.out.println(getAge());
        System.out.println("Random Year: "+getRandomYear());


        String name=fullName();
        boolean married=isMarried();
        int age=getAge();
        int year=getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = "+year);
        if(isMarried()){
            System.out.println("married");
        }else{
            System.out.println("single");
        }

    }
    public static String fullName(){
        return "Mike Smith";
    }
    public static boolean  isMarried(){
        return true;
    }
    public static int getAge(){
        return 30;
    }
    public static int getRandomYear(){
        Random random=new Random();
        int randomYear=random.nextInt(2021);
        return randomYear;

    }
}
