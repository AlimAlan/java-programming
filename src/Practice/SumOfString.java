package Practice;

/**
 * Write a method that can return the sum of the digits in a string
 */
public class SumOfString {
    public static void main(String[] args) {

//              3   7   11 14 17
        String str = "ass1saf2cas3fs4vs5";
        int result = 0;
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isDigit(each)) {
                temp = Integer.parseInt(each + "");
                result += temp;
            }
        }
        System.out.println(result);

    }
}


