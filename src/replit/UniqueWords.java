
package replit;
import java.util.*;
public class UniqueWords {
    public static void main(String[] args) {
        String []word={"java","code","python","code","rust","code","rust"};
        for(int i=0; i<word.length;i++){
            int counter=0;
            for(int j=0; j<word.length;j++){
                if(word[i].equals(word[j])){
                    counter++;
                }
            }
            if(counter==1){          //
                System.out.println(word[i]);
            }
        }

        }
    }

