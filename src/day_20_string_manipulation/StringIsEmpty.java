package day_20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle="";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length()==0);

        if(jobTitle.isEmpty()){
            System.out.println("Job Title is missing, please resend");

        }else{
            System.out.println("job title looks good!");

        }
        if(jobTitle.length()==0){
            System.out.println("job title is empty");
        }else{
            System.out.println("job title is not empty");

        }
        String word=" ";
        System.out.println(word.isEmpty()); //false because of space. Respect space!!!
        System.out.println(word.length()); //1

        String veggie="cucumber";
        System.out.println(veggie.isEmpty());  //false
        if(!veggie.isEmpty()){
            System.out.println("We have carrots");

        }

    }
}
