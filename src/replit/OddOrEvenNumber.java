package replit;
/**
Write  a method which can identifies given number is even or odd
EX: identify(5) ->  "Odd"
       identify(6) ->  "Even"
 */
public class OddOrEvenNumber {
    public static void main(String[] args) {
        int num=1;
        System.out.println(evenOrOdd(num));

    }
    public static String evenOrOdd(int a){
        String str="";
        if(a==0){
           str="Invalid input";
        }else if(a%2 ==0){
            str="Even";
        }else if(a%2==1){
            str="ODD";
        }
return str;
    }
}
