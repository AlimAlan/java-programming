package officeHours;
import java.util.Scanner;
public class AndroidVersion {

        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
            // Variables are already declared and given
            Scanner input = new Scanner(System.in);
            double version = input.nextDouble();

            //WRITE YOUR CODE HERE:
            if (version==1.5){
                System.out.println("Cupcake");

            }else if(version==1.6){
                System.out.println ("Donut");

            }else if(version==2.1){
                System.out.println("Eclair");

            }else if(version==2.2){
                System.out.println("Froyo");

            }else if(version==2.3){
                System.out.println ("Gingerbread");

            }else if(version==3.1){
                System.out.println("Honeycomp");

            }else if(version==4.0){
                System.out.println ("Ice cream sandwich");
            }else if(version==4.1){
                System.out.println("Jelly Bean");
            }else if (version==4.4){
                System.out.println("KitKat");



            }else if (version==5.0) {
                System.out.println ("Lollipop");
            }else if(version==8.0){
                System.out.println("Oreo");

            }else if(version==9.0){
                System.out.println("Pie");
            }else if(version==11.0){
                System.out.println("Sorry, I don't know this version");
            }else{
                System.out.println("Sorry, I don't know this version!");
            }


        }

}
