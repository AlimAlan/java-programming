package replit;

public class Test {
    public static void main(String[] args) {
        int num=12321;
        int remainder=0;
        int temp=num;
        int reverse=0;

        //lastDigit=temp%10;     => //1
        //reverse=reverse*10+
        /**
         * int num = 12345;
         *         int remainder1 = 0; // 11%2 = 2+2+2+2+2+1=1 ==> 1 is remainder
         *         int reverseNum = 0;
         *         int temp = num;
         *
         *         //LOOP
         *         //We need loop to process it so it will check each number
         *         while(temp!=0) {
         *             //1.
         *             //find the last number of the num, via math we can check by the remainder. If we will 12345/10 = 1234,5. =>
         *             //12345%10 = 5
         *             // 1234%10 = 4
         *             //Since java does not pay attention to the numb after "," so our remainder will this last number
         *             remainder1 = temp % 10;
         *             System.out.println("remainder1 = " + remainder1);
         *             //2. second we are reversing
         *             //Since this is not a String we can not just add remainder,
         *             //because it will add it and give sum... so we will do via math way
         *             //reverse = reverse * 10 +remainder;
         *             //reverse = 0 ==> 0*10+remainder ==> this way we will add number without changing the value
         *             //0*10+5 =5 ==> 0*10 = 0 ==> 0+5 = 5
         *             //5*10+4 =54 ==> 5*10 = 50 ==> 50 +4 = 54
         *             //54*10+3 =543 ==> 54*10=540 ==> 540+3 = 543
         *             //543*10+2 =5432 ==> 543*10=5430 ==>5430+2 = 5432
         *             //5432*10+1 =54321 -> this is our reverse number, so if we want to check if this is equal to the num
         *             reverseNum = reverseNum * 10 + remainder1;
         *             System.out.println("reverseNum = " + reverseNum);
         *             //3. we need to make our number smaller --> so loop can finish --> not let her to be infinite
         *             // If we will 12345/10 = 1234,5. so number will get smaller
         *             temp = temp / 10;
         *             System.out.println("temp = " + temp);
         *
         *
         *             //Now we need cond to  check if reverse number is equal to the original num
         *
         *             if(num==reverseNum){
         *                 System.out.println("Number is Palindrome");
         *             }
         *             System.out.println("Number is not Palindrome");
         *         }
         */



    }
}
