package Practice;

public class FindSumInString {
    public static void main(String[] args) {
        String word = "ADBD12ADR14ad8";        //16
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {

            if(Character.isDigit(word.charAt(i))){
                sum+=Integer.parseInt(String.valueOf(word.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}
