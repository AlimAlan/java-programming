package Practice;

public class Test {
    public Test(){
        System.out.println("A");
    }
    public Test(int a){
        System.out.println("B");
    }

    public static void main(String[] args) {
        Test obj=new Test(200);
    }
}
