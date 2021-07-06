package Practice;
/**
 * 15. Given an array of 3 characters print all permutation combinations from the given characters
 */

public class ThreePermutation {
    public static void main(String[] args) {
        // String [] word = [CAT]// CAT,CTA, ACT,ATC,TAC,TCA -------CAT
        char[] word = {'C', 'A', 'T'};
        //
        permutation(word);
    }

    public static void permutation(char[] word) {
        String letter1 = "";
        String letter2 = "";

        for (int i = 0; i < word.length; i++) {
            letter1 = word[i] + "";
            letter2 = word[i] + "";

            for (int j = 0, k = word.length - 1; j < word.length; j++, k--) {
                if (word[i] != word[j]) {
                    letter1 += "" + word[j];
                }
                if (word[i] != word[k]) {
                    letter2 += "" + word[k];
                }
            }
            System.out.println(letter1);
            System.out.println(letter2);
        }
    }
}


