package officeHours;

/*[Middle char]
Given a String, write a program to display the middle character of a string a)
If the length of the string is even there will be two middle characters.b)
 If the length of the string is odd there will be one middle character.
Ex:Input: elephant
Output: The middle characters: ph

 */
public class StringExersize {
    public static void main(String[] args) {

        String word="apple";
        System.out.println(word.substring(1));
        String word2="banana";
        System.out.println(word2.substring(0,5));

        String word3="elephant";


      System.out.println(word3.substring(3,5));

        if(word3.length()%2==0){
            System.out.println(word3.charAt(word3.length()/2));
            System.out.println(word3.charAt(word3.length()/2));
        }else {
            System.out.println(word3);

            String word4 = "elephant";
            if (word4.length() % 2 == 1) {
                System.out.println(word4.length() / 2);
                System.out.println(word4.substring(word4.length() / 2, word4.length() + 1));

            } else {


                int index = word4.length() / 2;
                System.out.println(word4.charAt(index - 1) + "" + word4.charAt(index));
                System.out.println(word4.substring(index - 1, index + 1));
            }
        }



        }

        }


