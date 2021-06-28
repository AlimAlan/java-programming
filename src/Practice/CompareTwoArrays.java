package Practice;

import java.util.Arrays;

public class CompareTwoArrays {
    public static void main(String[] args) {
        int[] one = {12, 23, 2, 78};
        int[] two = {2, 12, 23, 78};

        //without sorting
        int mainCounter = 0;
        for (int i = 0; i < one.length; i++) { //first loop is checking each "one" number
            int counter = 0;
            for (int j = 0; j < two.length; j++) { //second loop is comparing each "one" number to each "two" number
                if (one[i] == two[j]) {
                    counter++; //if we found one match I am adding one.... By the logic it has to find just one match
                }
            }
            mainCounter += counter; //then I am adding to mainCounter the counter that we set up in the inner loop.
            //so by the logic, each iteration(each loop) my counter has to be equal 1, so after each loop it will add 1 to the
            //main counter, so if my mainCounter will be equal 4 in the end, that means all my 4 numbers from one are repeated in the
            //second array too - therefore both array has the same numbers
        }
        if (mainCounter == one.length) {
            System.out.println("Numbers are match");
        }

        System.out.println("Second way+\n" + "-------------------");


        //sort - Array we can sort
        int[] one1 = {12, 23, 2, 78};
        int[] two2 = {2, 12, 23, 78};

        System.out.println("one1 before sort - " + Arrays.toString(one1));
        System.out.println("two2 before sort - " + Arrays.toString(two2));
        System.out.println("---------");
        Arrays.sort(one1);
        Arrays.sort(two2);
        System.out.println("one1 after sort - " + Arrays.toString(one1)); //why i wrote Arrays.toString?
        System.out.println("two2 after sort - " + Arrays.toString(two2));//because it will not print other way. try and see how is gonna be
        //comparing two arrays
        int count = 0;
        for (int i = 0; i < one1.length; i++) { //compare if two are equals... if yes both are same
            if (one1[i] == two2[i]) {
                count++; //if counter will be equal 4 --> both are the same
            }
        }
        if(count==one1.length){
            System.out.println("Both are same");
        }else{
            System.out.println("Not same");
        }
    }
}

