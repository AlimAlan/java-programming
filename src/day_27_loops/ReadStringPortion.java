package day_27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,black cat,red car";
        for (int i = 0; i < list.length() - 2; i++) {
            System.out.println(list.substring(i, i + 3));

            if (list.substring(i, i + 3).equals("cat") || list.substring(i, i + 3).equals("car")) {
                System.out.println("cat or car found");
            }

        }

        //with variable


        for (int i = 0; i < list.length() - 2; i++) {
            String part = list.substring(i, i + 3);

            if (part.equals("cat") || part.equals("car")) {
                System.out.println("cat or car found");
            }


            // int i=0;

            // i++;
            // System.out.println(list.substring(i, i+3));
            // i++;
            // System.out.println(list.substring(i, i+3));
            //   i++;
            // System.out.println(list.substring(i, i+3));
            // i++;
            // System.out.println(list.substring(i, i+3));


        }
    }
}