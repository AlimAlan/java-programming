package day_19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[]args){
        String word = "Selenium";
        System.out.println(word.startsWith("Sele"));
        System.out.println(word.endsWith("m"));
        System.out.println("java".startsWith("ja"));
        System.out.println(word.endsWith("Selenium"));

        System.out.println(word.endsWith("NIUM"));
        System.out.println(word.endsWith("ium"));


        String name="Meerim";
        System.out.println("female name:"+name);

        String firstName="Dr.Meerim";
        if (firstName.startsWith("Mr.")){
            System.out.println("Man");
        }else if(firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        }else if(firstName.startsWith("Mrs.")) {
            System.out.println("Married woman");
        }else if(firstName.startsWith("Ms")){
            System.out.println("single");
        }else if(firstName.startsWith("Sr.")) {
            System.out.println("Senior");

        }else {
            System.out.println("Normal name");

        }
        String url= "https://www.iherb.com";
        if(url.endsWith("com")){
            System.out.println("commercial website");
        }else if(url.endsWith("ru")){
            System.out.println("russian website");
        }else if(url.endsWith("org")){
            System.out.println("organization website");

        }else if(url.endsWith("edu")){
            System.out.println("educational website");
        }else if(url.endsWith("jp")){
            System.out.println("japanise website");

        }
    }
}
