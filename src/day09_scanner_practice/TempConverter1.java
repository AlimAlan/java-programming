package day09_scanner_practice;
import com.sun.xml.internal.org.jvnet.fastinfoset.sax.helpers.EncodingAlgorithmAttributesImpl;

import java.util.Scanner;

public class TempConverter1 {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        System.out.println("####### F to C CONVERTER PROGRAM #########");
        System.out.println("Enter Fahrenheit value: ");
        double fahrenheitValue=input.nextDouble();
        double celsiusValue=(fahrenheitValue-32)*5/9;
        System.out.println(celsiusValue);

    }
}
