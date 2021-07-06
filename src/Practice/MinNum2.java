package Practice;
/**
 * Write a method that can find min number from  int Array
 */
public class MinNum2 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 89, 90, 3, 0, -4};
        System.out.println(minNum(arr));
        System.out.println(maxNum(arr));
    }

    public static  int minNum(int[] num) {
        int temp = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < temp) {
                temp = num[i];

            }

        }
        return temp;
    }
    public static int maxNum(int []max){
        int temp1=max[0];
        for(int i=0;i<max.length;i++){
            if(max[i]>temp1){
                temp1=max[i];

            }
        }
        return temp1;
    }
}