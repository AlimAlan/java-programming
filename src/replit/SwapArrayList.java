package replit;

import java.util.ArrayList;
import java.util.*;
public class SwapArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int pos1 = in.nextInt();
        int pos2 = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }
        System.out.println(list);
        Collections.swap(list,1,2);
        System.out.println(list);

      //  System.out.println(swap(list, pos1, pos2));
    }
}
