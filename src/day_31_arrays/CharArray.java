package day_31_arrays;

public class CharArray {
    public static void main(String[] args) {

        char []letters={'j','a','v','a',' ', 'i','s',' ','f','u','n'};
        System.out.println(letters[0]);
        for(int i=0; i<=letters.length; i++){
            System.out.println(letters);

        }
        for(char letter:letters){
            System.out.print(letter+" ");
        }

        String sentence=new String(letters);
        System.out.println("\nSentence: "+sentence);//converting char to String

         String item="wooden spoon";
         char[]itemArray=item.toCharArray();
        System.out.println("itemArray.length = "+itemArray.length);
        System.out.println("item.length()= "+item.length());

        String[]fruits={"bananas","apples","mango","kiwi","papaya","strawberry"};
        String fruitStr="";

        System.out.println(fruits[0]+" * "+fruits[1]+" * "+fruits[2]+" * "+fruits[3]+" * "+fruits[4]+" * "+fruits[5]+" * ");
        for(String each:fruits){

            System.out.print(each+" | ");
            fruitStr+=each+" | ";
            System.out.print("\nFruitSTR "+fruitStr);


            String[]languages={"java","python","c++","SQL","ruby","javacript"};
            System.out.println();
            System.out.println(String.join("|",languages));
            System.out.println(String.join("###",languages));
            String joinedLanguages=String.join(" <> ",languages);
            System.out.println("joinedLanguages = "+joinedLanguages);

        }

    }
}
