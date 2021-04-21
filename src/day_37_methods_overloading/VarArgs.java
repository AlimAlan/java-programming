package day_37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100,200,300);
        addNumbers(25,85,78895,784566,25,4575,77855,355225,457863,78622,4545);
        addNumbers();
    }
    public static void addNumbers(int ... nums){
        int sum=0;
        for(int n:nums){
            sum+=n;

        }
        System.out.println("sum = "+sum);
    }
}
