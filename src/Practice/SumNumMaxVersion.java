package Practice;

public class SumNumMaxVersion {
    public static void main(String[] args) {
        String word = "ABCD123EFG45HI6789";
        String temp="";
        int result=0;

        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);
            if(i==word.length()-1){
                if(Character.isDigit(each)){
                    temp+=""+each;
                    result+=Integer.parseInt(temp); }
                break;
            }

            if(Character.isDigit(each)){
                temp+=""+each;
                if(!Character.isDigit(word.charAt(i+1))){
                    result+=Integer.parseInt(temp);
                    temp="";
                }
            }
        }

        System.out.println(result);
    }
}
