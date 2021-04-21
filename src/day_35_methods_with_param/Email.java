package day_35_methods_with_param;
import java.util.Locale;
import java.util.Scanner;
public class Email {
    public static void main(String[] args) {
        buildEmail("crazyfrog","gmail");
        buildEmail("John Ward |||".replace(" ","_").toLowerCase(),"verizon");



    }
    public static void buildEmail(String name, String domain){
        name=name.replace(" ","_").toLowerCase();
        domain=domain.toLowerCase();
        String email=name+"@"+domain+".com";

        System.out.println(email);

    }
}
