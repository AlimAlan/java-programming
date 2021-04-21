package officeHours.Practice_04_07_2021;

/**
 * Given a string of words that follow Camel Case convention.
 */
public class CamelCase {
    public static void main(String[] args) {
        String str="thisHasManyWordsToFind";
        int words=1;
        String temp="";

        if(str.isEmpty()){
            words=0;
        }
        for(int i=0; i<str.length();i++){
            temp+=str.charAt(i);
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                words++;

            }
        }
        System.out.println("Words: "+words);

    }
}
