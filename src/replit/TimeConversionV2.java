package replit;
import java.util.*;
public class TimeConversionV2 {

            public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String timeConversion = scan.nextLine();

                timeConversion(timeConversion);

            }

            public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
                //  Input: 12:00:00AM ==> Output: 00:00:00
                //  Input: 02:02:02AM ==> Output: 02:02:02
                //  Input: 02:02:02PM ==> Output: 14:02:02
                //  input: 12:02:02PM ==> output: 12:02:02
                String militaryTime = "";
                if (s.contains("AM")) {
                    //s = 12:00:00AM
                    s = s.replace("AM", "");
                    //s = 12:00:00
                    String [] timeArray = s.split(":");
                    // {12, 00, 00}
                    if (timeArray[0].equals("12")){
                        timeArray[0] = "00";
                        // {00 ,00, 00}
                    }
                    militaryTime = String.join(":" , timeArray);
                    System.out.println(militaryTime);
                    // 00:00:00
                }
                else{
                    s = s.replace("PM" , "");
                    String[] timeArray = s.split(":");

                    if (!timeArray[0].equals("12")){
                        timeArray[0] = Integer.toString(Integer.parseInt(timeArray[0] ) +12);
                        militaryTime = String.join(":" , timeArray);

                    }else
                        militaryTime = String.join(":" , timeArray);
                    System.out.println(militaryTime.trim());

                }

            }
        }

