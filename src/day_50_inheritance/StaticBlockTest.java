package day_50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1=new StaticBlockDemo();    //static(10) runs =>constructor runs(15)
        StaticBlockDemo st2=new StaticBlockDemo();    //constructor runs again(20)

        StaticBlockDemo st3=new StaticBlockDemo(); //constructor (25)
        System.out.println(StaticBlockDemo.num);
        StaticBlockDemo st4=new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num);   //75




    }
}
