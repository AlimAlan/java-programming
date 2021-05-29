package replit;
import java.util.*;

public class PrintImage {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int image = 0;
        System.out.println("please select image");
        int s=scan.nextInt();



        switch (s) {
            case 1:
                System.out.print("please select image");
                printSunset();
                break;
            case 2:
                System.out.print("please select image");
                printDesert();
                break;
            case 3:
                System.out.println("please select image");
                printEarth();
                break;
            default:

        }
    }
    public static void printSunset() {
            System.out.print("_\\/_                 |                _\\/_\r\n" +
                    "/o\\\\             \\       /            //o\\\r\n" +
                    " |                 .---.                |\r\n" +
                    "_|_______     --  /     \\  --     ______|__\r\n" +
                    "1       `~^~^~^~^~^~^~^~^~^~^~^~`\r\n");
        }
        public static void printEarth()  {

        System.out.print("22        _____\r\n" +
                "    ,-:` \\;',`'-, \r\n" +
                "  .'-;_,;  ':-;_,'.\r\n" +
                " /;   '/    ,  _`.-\\\r\n" +
                "| '`. (`     /` ` \\`|\r\n" +
                "|:.  `\\`-.   \\_   / |\r\n" +
                "|     (   `,  .`\\ ;'|\r\n" +
                " \\     | .'     `-'/\r\n" +
                "  `.   ;/        .'\r\n" +
                "jgs `'-._____.");

    }//print_earth

    public static void printDesert() {

        System.out.print(" 33   .    _    +     .  ______   .          .\r\n" +
                " (      /|\\      .    |      \\      .   +\r\n" +
                "     . |||||     _    | |   | | ||         .\r\n" +
                ".      |||||    | |  _| | | | |_||    .\r\n" +
                "   /\\  ||||| .  | | |   | |      |       .\r\n" +
                "__||||_|||||____| |_|_____________\\__________\r\n" +
                ". |||| |||||  /\\   _____      _____  .   .\r\n" +
                "  |||| ||||| ||||   .   .  .         ________\r\n" +
                " . \\|`-'|||| ||||    __________       .    .\r\n" +
                "    \\__ |||| ||||      .          .     .\r\n" +
                " __    ||||`-'|||  .       .    __________\r\n" +
                ".    . |||| ___/  ___________             .\r\n" +
                "   . _ ||||| . _               .   _________\r\n" +
                "_   ___|||||__  _ \\\\--//    .          _\r\n" +
                "     _ `---'    .)=\\oo|=(.   _   .   .    .\r\n" +
                "_  ^      .  -    . \\.|");

    }//end


}


