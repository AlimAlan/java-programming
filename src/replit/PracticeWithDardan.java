package replit;

public class PracticeWithDardan {
    public static void main(String[] args) {
        String str="hello hello world what is good what java java java";

        System.out.println(coutWords(str, "hello"));

    }

    public static int coutWords(String str, String word) {
        int cout=0;

        String replacement=str.replace(word,"");
        cout=(str.length()-replacement.length())/word.length();
        return cout;

    }
}
