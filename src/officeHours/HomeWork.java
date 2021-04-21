package officeHours;

public class HomeWork {
    public static void main(String[] args) {


    String genre="Fantacy";
    double pageLenght=0.0;
    double profit=0.0;
    int sequels=0;
    int countries =50;

    if(genre.equals("detective")){

    }
    switch ("detective") {
        case "genre":
            System.out.println("You can write-" + genre + "book");
            pageLenght = 500;
            profit = 1000000;
            sequels = 5;
            countries = 50;
            break;
        case "detective":
            System.out.println("You can write-" + genre + " book");
            pageLenght = 350;
            profit = 700000;
            sequels = 3;
            countries = 45;
            break;
        default:
            System.out.println("You dont need to write any book");

        case "Science Fiction":
            System.out.println("You can write - "+genre+ " book");
            pageLenght=720;
            profit=900.500;
            sequels=4;
                    countries=30;


    }
        System.out.println("Page Lenght: "+pageLenght);


}
}
