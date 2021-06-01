package replit;
import java.util.*;
public class IsEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
       String []reverse=sentence.split(" ");

//       reverse[0]=reverse[reverse.length-1];
//      reverse[2]=reverse[0];
//        System.out.println(Arrays.toString(reverse));
        for(int i=reverse.length-1;i>=0;i--){
            System.out.print(reverse[i]);
        }
    }
}
