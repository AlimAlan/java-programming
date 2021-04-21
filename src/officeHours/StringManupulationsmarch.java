package officeHours;

public class StringManupulationsmarch {
    public static void main(String[] args) {
        String str="Hello World";
        str.trim();
        int z=str.indexOf(" ");
        System.out.println(z);

       // String s1="abcdefg";
     //   String s2=""+s1.charAt(0)+s1.charAt(s1.length());
      //  System.out.println(s2);


        String s3="wooden spoon";
        String s2=s3.substring(s3.indexOf("s"));
        System.out.println(s2);

    }

}
