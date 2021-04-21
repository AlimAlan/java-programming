package replit;
import java.util.*;
public class SplitPersonsName {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String s=inp.next();
        person(s);



    }

    public static void person(String info) {
        String[] sentence = new String[3];
        sentence = info.split(",");
        System.out.println("Person name: "+sentence[0]);
        System.out.println("last name: "+sentence[1]);
        System.out.println("age: "+sentence[2]);



        }


    }

