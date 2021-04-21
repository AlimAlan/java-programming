package officeHours;

public class testquize {
    public static void main(String[] args) {
        int x=10;
        int y= x++;
        System.out.println(y++ +""+x++ + ""+y);


        boolean x1=true;
        boolean y1=!true==false;
        boolean z1=y1;

        if(x1){
            System.out.println("Hello");

        }
        if(y1){
            System.out.println("today is great day");

        }
        if (z1){
            System.out.println("we are improving everyday");

        }
        int num =9;
        if(num++ ==10){
            System.out.println("Hello world"+num);

        }else{
            System.out.println("Hello universe"+num);

        }
    }
}
