package officeHours.OfficeHours;
import java.util.Scanner;
public class Practice_03_08_2021 {
    public static void main(String[] args) {
      //  double lenght;
     //   double width;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your length:");
        double lenght = input.nextDouble();
        System.out.println("Enter your width:");
        double width = input.nextDouble();

        double perimeter = 2*(lenght+width);
        double area = lenght*width;
        System.out.println("perimeter="+perimeter);
        System.out.println("area="+area);



    }
}
