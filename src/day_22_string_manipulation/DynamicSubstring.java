package day_22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13));
        System.out.println(result.substring(13,18));
        System.out.println(result.indexOf(":"));

        int colonindex=result.indexOf(":");
        System.out.println(colonindex+1);
        System.out.println(result.substring(result.indexOf(":")+1));

        String today="i learned [java] today";
        System.out.println(today.indexOf("["));
        System.out.println(today.indexOf("]"));
        System.out.println(today.substring(10));
        System.out.println(today.substring(11,15));

        int start=today.indexOf("[");
        int end =today.indexOf("]");
        System.out.println(today.substring(start+1,end));
        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));





    }
}
