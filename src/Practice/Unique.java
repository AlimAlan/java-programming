package Practice;

public class Unique {
    public static void main(String[] args) {
        String word = "java";
        String uniq = "";
        int count = 0;

        for(int i = 0; i< word.length(); i ++){ // java
            count = 0;
            if (uniq .contains("" + word.charAt(i))) {
                continue;
            }

            for(int j = 0; j<word.length() ; j++){
                if (word.charAt (i) == word.charAt(j)) {
                    count ++;
                }
            }
            uniq += word.charAt(i);
        }
        System.out.println(uniq);
    }
}


/**
 *  String word = "javva";
 *         String unique = "";
 *
 *         for (int i = 0; i < word.length(); i++) {
 *             if (!unique.contains(word.charAt(i)+"")) {
 *                 unique += word.charAt(i);
 *             }
 *         }
 *         System.out.println("Unique characters: " + unique);
 *     }
 * }        //second way of solving unique character task
 */
