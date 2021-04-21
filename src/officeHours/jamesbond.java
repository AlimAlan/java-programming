package officeHours;

import java.util.Locale;

/*[Initials]Given a person's name in a String (first and last name), then prints out the initials of the user.
The initials should be uppercase.Ex: input: james bondo
utput: your initials are JB

 */
public class jamesbond {
    public static void main(String[] args) {
        String name="james bond";
        String first= name.toUpperCase().charAt(0)+"";
        String last=name.toUpperCase().charAt(name.indexOf(" ")+1)+"";
        System.out.println(first+last);




    }
}
