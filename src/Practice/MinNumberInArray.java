package Practice;

/**
 * Write a method that can find min number from  int Array
 */
public class MinNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 89, 90, 3, 0,-4};

        System.out.println(returnMinNumber(arr));

    }

    public static int returnMinNumber(int[] a) {
        int temp=a[0];


        for (int i = 0; i < a.length; i++) {
            if(a[i]<temp){
                temp=a[i];

            }
        }
        return temp;

        }

}