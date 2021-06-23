package Practice;

/**
 * Write a method that can find the maximum number from an int Array
 */
public class MaxNumInArray {
    public static void main(String[] args) {
        int[] arr = {6,23,87,5,33,11};
        int temp = arr[0];

        for(int i=1;i<arr.length;i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
}
