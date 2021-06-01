package replit;
import java.util.*;
public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
        int sum=0;
        for( double each:temps){
            sum+=each;

        }

        System.out.println("sum => "+sum);
        System.out.println("average is => "+sum/8);


    }
}
