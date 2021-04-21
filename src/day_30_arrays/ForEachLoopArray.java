package day_30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 1, 5454, 123, 484, 39372, 9, 484, 865};
        for (int eachNum : data) {
            System.out.println(eachNum);

        }
        for (int n : data) {
            System.out.print(n + " ");
        }
        System.out.println("\n***********FOR LOOP***********");
        //repeat above with for loop
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);

        }
        System.out.println("Last value: " + data[data.length - 1]);


        System.out.println("last value: " + data[data.length - 1]);

        //print all number backwards in same line
        for (int idx = data.length - 1; idx >= 0; idx--) {
            System.out.print(data[idx] + " ");
        }
    }
}