package day_42_arrayList;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    /**
     * methodName: printStrList
     * param: List of Strings
     * return:void
     * prints all values separated by space in same line

     */
    public static void main(String[] args) {
        List<String> words =new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a");words.add("input");words.add("title");
        //pass the words list to  printList method
        printStrList(words);
       // printStrList();
        printStrList(Arrays.asList("select","option","br","python","SQL","API"));

       List<Integer> nums=Arrays.asList(23,45,6855,123,55,5,5,5,2);
       int sum =sumIntegerList(nums);
        System.out.println("sum "+sum);

    }
    public static void printStrList(List<String>stringList){
        for(String str:stringList){
            System.out.print(str+" ");
        }
        System.out.println();


    }
    /**
     * method: sumIntegerList
     * param: List of Integers
     * returns: int
     * calculates sum of integers in the list then returns
     */
    public static int sumIntegerList(List<Integer> integerList) {
        int sum=0;
        for (int each:integerList){
            sum+=each;
        }
        return sum;
    }
}
