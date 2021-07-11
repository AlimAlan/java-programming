package replit;

public class FindSumInString {
    public static void main(String[] args) {
        String word="AD3CS3CDD45F8E";          //3+3+4+5+8
        int sum=0;
        for(int i=0; i<word.length();i++){
            if(Character.isDigit(word.charAt(i))){
                sum+=Integer.parseInt(word.charAt(i)+"");
            }
        }
        System.out.println(sum);
    }
}
