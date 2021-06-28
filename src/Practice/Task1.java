package Practice;

/**
 * String str = "Meerim is super SDET";
 */
public class Task1 {
    public static void main(String[] args) {
        String str="Meerim is super SDET";
         //         012345                 -1
        String last4Char="";
        int temp=str.length();
        System.out.println(temp);
        str=str.substring(temp-4);
        System.out.println(str);




    }

}
