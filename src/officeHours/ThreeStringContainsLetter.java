package officeHours;

public class ThreeStringContainsLetter {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "mouse";
        String word3 = "apples";
        String biggestWordWithA = "";

        if (word1.contains("a") && word1.length() > biggestWordWithA.length()) {
            biggestWordWithA = word1;

        }
        if (word2.contains("a") && word2.length() > biggestWordWithA.length()) {
            biggestWordWithA = word2;

        }
        if (word3.contains("a") && word3.length() > biggestWordWithA.length()) {
            biggestWordWithA = word3;

        }
        if(biggestWordWithA.isEmpty()){
            System.out.println("No words contains A");

        }
        System.out.println("Longest word with A: " + biggestWordWithA);
    }

}
