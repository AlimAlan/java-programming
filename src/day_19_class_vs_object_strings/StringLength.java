package day_19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {

        String name= "Timur";
        System.out.println(name.length());

        System.out.println(name);
        System.out.println("count: "+name.length());


        System.out.println("wooden spoon".length());
        String lastName="Arstanbek";
        System.out.println(lastName+"-"+lastName.length());
        int count=lastName.length();
        System.out.println("count = " + count);


        String password="abc123";
        if(password.length()>=6){
            System.out.println("Valid Amazon password");
        }else{
            System.out.println("Password must be at least 6 characters ");


        }
        float f1= 98758901754890175941f;
        float f2=f1+37373;
        System.out.println(f2);






    }
}
