package day_30_arrays;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {

        String[]student1={"MA1234", "Meerim", "Alimbekova", "Batch22", "3474150123"};
        String[]student2={"AB4567", "Aisalkyn", "Bektemirova", "Batch22", "7123648393"};
        String[]student3={"MH4593", "Mariia", "Heria", "Batch22", "347839203948"};


        System.out.println("student ID: "+student1[0]);
        System.out.println("student firstname: "+student1[1]);
        System.out.println("student lastName: "+student1[2]);
        System.out.println("student batch num: "+student1[3]);
        System.out.println("student mobile num: "+student1[4]);

        System.out.println("Student Data Length: "+student1.length);

        if(student1.length==5){
            System.out.println("Pass: data array has correct length");
        }else{
            System.out.println("Fail: data array has incorrect length");
        }
        if(student1.length==student2.length){
            System.out.println("Pass: data array has correct length");
        }else{
            System.out.println("Fail: data array has incorrect length");

        }
        System.out.println(student1[1].toUpperCase()+" "+student1[2].toUpperCase());

        String mobileNum=student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("347"));






    }
}
