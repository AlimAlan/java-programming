package officeHours.Practice_04_07_2021;

public class DuplicateCharacters {
    public static void main(String[] args) {
        /**
         * Given a String,find and print the duplicate characters. A character is duplicate if it appears more
         *
         */
        String str = "AAABCCDEEF";
        String checked="";
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            if (checked.contains(""+str.charAt(i))){
                continue;
            }
           // str.charAt(i);
          for(int j=0; j<str.length(); j++){
              if(str.charAt(i)==str.charAt(j)){
                  count++;
              }
          }
          if(count>1){
              System.out.println(str.charAt(i)+" is duplicate");

          }
          checked+=str.charAt(i);

        }
    }
}