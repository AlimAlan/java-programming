package day_14multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "sunny";
        if (weather=="sunny"){
            System.out.println(weather+" Go to park, hiking and code JAVA");
        }else if(weather.equals("rainy")){
            System.out.println(weather=" stay  home, drink tea, and code JAVA");

        }else if (weather.equals("snow")){
            System.out.println(weather=" clean the car and build snowman. drink hot chocolate");
        }else if (weather.equals("windy")){
            System.out.println(weather+" get ready for power loss, fly a kite and code java");
        }else{
            System.out.println("just keep coding JAVA");

        }

    }
}
