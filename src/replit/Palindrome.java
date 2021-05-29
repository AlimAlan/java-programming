package replit;

public class Palindrome {
    public static void main(String[] args) {
        boolean isPalindrome=true;
        String word="i am not palindrome";
        for (int i = 0; i <word.length()/2 ; i++) {
            if(word.charAt(i)!=word.charAt(word.length()-1)){
                isPalindrome=false;
            }

        }
        System.out.println(isPalindrome);
    }
}
