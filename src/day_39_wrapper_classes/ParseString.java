package day_39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total="345";
        int count=Integer.parseInt(total);
        System.out.println("count = "+count);
        String strPrice="123.5";
        double price=Double.parseDouble(strPrice);
        if(price>100){
            System.out.println("expensive");
        }
        String sentence="I wrote 100 lines of code";
        String[] word=sentence.split(" ");
        int linesOfCode=Integer.parseInt(word[2]);

        System.out.println("Lines Of Code => "+linesOfCode);
    }
}
