package day_28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        String sourse="ABCDEFGHIJKLMNOPQRSTUVZabcdefghijklmnopqrtuvwxyz0123456789_@#$%^&*()";
        Random random=new Random();
        String password="";

        for(int i =1; i<=8; i++){
            int index=random.nextInt(69);  //random# 0-72

            System.out.print(sourse.charAt(index));
            //sourse.substring(index, index+1);
         //   password=password +sourse.charAt(index);
            password+=sourse.charAt(index);
            // System.out.println(random.nextInt(sourse.length()));
        }
        System.out.println("\nYour password = "+password);

    }
}
