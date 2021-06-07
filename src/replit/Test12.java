package replit;

public class Test12 {
    public static void main(String[] args) {


        /**
         * 4. String palindrome.
         *  // isPal("anna")   -> true
         *   // isPal("civic")  -> true
         *   // isPal("apple")  -> false
         *   // isPal("level")  -> true
         */
        //  0 1 2 3 4
        String word = "c i v i c";
        boolean isPalindrome = true;

        for (int i = 0; i <= word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrome = false;

            }
        }

        System.out.println(isPalindrome);

    }
}