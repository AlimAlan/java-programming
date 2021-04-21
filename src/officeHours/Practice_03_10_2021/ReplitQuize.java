package officeHours.Practice_03_10_2021;
import java.util.*;
public class ReplitQuize {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("what is the farthest planet in the solar system:" );
            System.out.println("a)venus" );
            System.out.println("b)pluto" );
            System.out.println("c)neptune" );

            String a = s.nextLine();

            //your code here
            if(a.equals ("b")) {
                System.out.println("b is correct");

            }else if (a.equals("a") || a.equals("c"))  {
                System.out.println(a+" is wrong");

            }else {
                System.out.println(a+" is not a valid answer");

            }
        }

}
