package replit;

public class LongestString {
    public static void main(String[] args) {
        String[]word={"apple","kiwi","banana","orange","grape","watermelon"};
        String longest="";      //0 ->apple

        for(int i=0; i<word.length; i++){
            if(word[i].length()>longest.length()){
                longest=word[i];
            }
        }
        System.out.println(longest);
    }
}
