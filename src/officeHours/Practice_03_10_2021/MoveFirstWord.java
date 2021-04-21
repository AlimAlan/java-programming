package officeHours.Practice_03_10_2021;

public class MoveFirstWord {
    public static void main(String[] args) {
        String str="Java is a fun language";
        int space=str.indexOf(" ");
        String firstWord=str.substring(0,space);
        System.out.println(str.substring(space+1)+" "+firstWord);

    }
}
