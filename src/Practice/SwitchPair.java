package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Switch PairsThis method will take an ArrayList of words and switch position for each pair in the List.
 * A pair is an element and the element next to it.
 * The given ArrayList will always have an even number of elements so each element will always have a single pair.
 * @param words -Given ArrayList of Strings@return -ArrayList of StringsEx:Input: {"Cat", "in", "the", "hat"}
 *              There is two pairs: "Cat" and "in""the" and "hat"Output: {"in", "Cat", "hat", "the}
 */
public class SwitchPair {
    public static void main(String[] args) {
        ArrayList<String> words= new ArrayList<>(Arrays.asList("cat","in","The","hat"));
        System.out.println(Switch(words));
    }
public static ArrayList<String> Switch(ArrayList<String> words){
        for (int i=0; i<words.size();i+=2){
            Collections.swap(words,i,i+1);
        }
        return words;
}

}
