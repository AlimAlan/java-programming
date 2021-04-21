package day_35_methods_with_param;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
public class VoidMethods {
    public static void main(String[] args) {
        printAtoZ();
        displayUSFlag();
    }

    public static void printAtoZ() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i + " ");
        }
        System.out.println();

    }

    public static void displayUSFlag() {
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }

    }
}