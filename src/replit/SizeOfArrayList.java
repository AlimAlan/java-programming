package replit;
import java.util.*;
import java.util.ArrayList;

public class SizeOfArrayList {
    public static void main(String[] args) {
        //public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            int sum=0;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i < size; i++) {

                list.add(in.nextInt());
               // sum+=list;
                sum+=list.get(i);
            }


     System.out.println(sum);


    }
}
