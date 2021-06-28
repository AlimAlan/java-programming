package Practice;

/**
 * String word = "ABCD123EFG45HI6789";
 * 123+45+6789
 * 6957
 */
public class FindSumOfString {
    public static void main(String[] args) {
        String word = "ABCD123EFG45HI6789";
        String temp = "";

//char[] tempArr = [123, 45, 6789];
        int result = 0;
        for (int i = 0; i < word.length(); i++) {

            if (i == word.length() - 1 && Character.isDigit(word.charAt(i))) {
                temp += word.charAt(i) + "";
                break;
            }
            if (i == word.length() - 1 && Character.isLetter(word.charAt(i))) {
                break;
            }

            if (Character.isDigit(word.charAt(i)) && Character.isDigit(word.charAt(i + 1))) {
                temp += word.charAt(i) + "";
            } else if (Character.isDigit(word.charAt(i)) && Character.isLetter(word.charAt(i + 1))) {
                temp += word.charAt(i) + " ";
            }
        }
        String[] wordArr = temp.split(" ");
        for (String each : wordArr) {
            result += Integer.parseInt(each);
        }
        System.out.println(result);

    }

    }


