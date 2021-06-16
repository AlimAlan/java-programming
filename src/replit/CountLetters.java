package replit;

public class CountLetters {
    public static void main(String[] args) {
        String letters = "aaabbcccccc";
        String duplicate = "";


        for (int i = 0; i < letters.length(); i++) {
            int count=0;
            for(int j=0;j<letters.length();j++){
                if(letters.charAt(i)==letters.charAt(j)&& !duplicate.contains(letters.charAt(i)+"")){
                    count++;
                    continue;
                }

            }
            duplicate=letters.charAt(i)+"";
            if(count!=0) {

                System.out.println(letters.charAt(i) + " = " + count);
            }

        }


        }
    }
