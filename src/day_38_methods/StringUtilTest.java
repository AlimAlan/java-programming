package day_38_methods;
/**
 * import all static methods. so that you can just call by method name, without classname
 */
import com.sun.xml.internal.xsom.XSUnionSimpleType;

import static day_38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)) {
            System.out.println("FAIL: Username cannot be null or empty");
        }

        System.out.println("isPalinrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = " + isPalindrome("Cybertek"));
        System.out.println("return reverse "+StringUtils.reverser("java"));

        String word="java";
        String revWord=StringUtils.reverser(word);
        System.out.println("word = "+word);
        System.out.println("revWord= "+revWord);

    }
}