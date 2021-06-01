package Practice;

import java.util.Arrays;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        int num  =1235321;
        Integer numInt = num;// primitive -->objesct
        String strNum = numInt.toString();
        char [] charNum = strNum.toCharArray();

        System.out.println(Arrays.toString(charNum));

        int count = 0;
        for (int i = 0,j=charNum.length-1; i < charNum.length/2; i++,j--) {
            if (charNum[i]!=charNum[j]){
                count++;
                break;
            }
        }
        boolean isPalindrome = count == 0 ? true: false;
        System.out.println(isPalindrome);

    }
}

///**
// second version
// public static void main(String[] args) {
// int num = 545;
// int temp = num;
// int reverse = 0;
//
// //545%10=5
// //54%10=4
//
// //temp   54
// while(temp != 0){
//
// int lastdigit = temp%10; // 5
// reverse = reverse*10 +lastdigit; //reverse = 3    30+4=34  340+5 =345
//
// temp = temp/10;//   54     5   5/10=0.5 0
// }
//
///* System.out.println(num==reverse);
//
//