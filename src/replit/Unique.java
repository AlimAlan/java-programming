package replit;

/**
 * [IQ] Unique charactersGiven a String, find and print the unique characters.
 * A character is unique if it only appears once in the String.
 * Ex:AAABCCDEEFOutput:BDF
 */
public class Unique {
    public static void main(String[] args) {
        String str="AAABCCDEEF";
        String unique="";

        for(int j=0; j<str.length(); j++){


            int count = 0;
            for(int i=0; i<str.length(); i++){

                if(str.charAt(i)== str.charAt(j)){
                    count++;

                }
            }

            if(count==1){
                unique+=str.charAt(j);
            }



        }
        System.out.println(unique);

    }
}
