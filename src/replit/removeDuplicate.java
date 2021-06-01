package replit;

public class removeDuplicate {
    public static void main(String[] args) {
        String word="mohammad";
        System.out.println(nonDuplicate(word));
    }
    public static String nonDuplicate(String name){
        String output="";
        for (int i=0; i<name.length();i++){
            if(!output.contains(""+name.charAt(i))){
                output+=name.charAt(i);
            }
        }
        return output;

    }
}
