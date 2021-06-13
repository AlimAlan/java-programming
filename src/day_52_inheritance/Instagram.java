package day_52_inheritance;

public class Instagram extends MobileApp{
public void postPhoto(){
    System.out.println("Posting photo on instagram");

}
public void useTheApp(int minutes){
    super.useTheApp(minutes);
    System.out.println("Using instagram app features");
    postPhoto();

}

}
