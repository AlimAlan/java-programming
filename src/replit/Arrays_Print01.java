package replit;
import java.util.*;
public class Arrays_Print01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        for(String each:arr){
           // if(arr.length>=3){
                System.out.println(each.toString().substring(0,3));
            }
        }

}
