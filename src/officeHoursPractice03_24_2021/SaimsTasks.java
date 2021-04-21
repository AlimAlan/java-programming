package officeHoursPractice03_24_2021;

public class SaimsTasks {
    public static void main(String[] args) {
        String word1="apple";
        System.out.println(word1.substring(1));

        String word2="banana";
        System.out.println(word2.substring(0,word2.length()-1));

        String word3="Virginia";
        if(word3.length()%2==0){
            System.out.println(word3.charAt(word3.length()/2-1)+""+(word3.charAt(word3.length()/2)));
        }else{
            System.out.println(word3.charAt(word3.length()/2));
        }
    }
}
