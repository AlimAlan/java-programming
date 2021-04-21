package day_22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {

        String technologies="java, html, css, selenium, testing, maven, cucumber. sql";

        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));

        int indexOfJava=technologies.indexOf("java");
        System.out.println("java is at index - "+indexOfJava);
        int idxOfCss=technologies.indexOf("css");
        System.out.println("css is at index - "+idxOfCss);
        int idxSQL=technologies.indexOf("sql");
        System.out.println("SQL is at index - "+idxSQL);

        if(technologies.contains("maven")){
            System.out.println("maven");

        }else{
            System.out.println("no maven contains");

        }
        if(technologies.indexOf("maven")>-1){

        }







    }
}
