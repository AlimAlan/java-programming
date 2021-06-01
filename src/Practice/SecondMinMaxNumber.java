package Practice;

public class SecondMinMaxNumber {
    public static void main(String[] args) {
        int[] nums = {4, 781, 8, 99, 103};
        int maxNum = nums[0];
        int secMaxNum = nums[0];

        for (int eachNum : nums) {
            if (eachNum > maxNum) {
                secMaxNum = maxNum;
                maxNum = eachNum;
            }
            if (eachNum > secMaxNum && eachNum < maxNum) {
                secMaxNum = eachNum;
            }
        }

        System.out.println(secMaxNum);
    }
}
