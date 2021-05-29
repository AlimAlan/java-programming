package day_44_custom_classes;

/**
 * this class is used to create objects of App class
 */
public class MyApps {
    public static void main(String[] args) {
      //  App application=new App();
        App uberApp=new App();         //creating new object
        uberApp.open();      //call open method using object variable
        uberApp.version=2.2;
        uberApp.name="Uber";
      uberApp.open();
      uberApp.version=4.0;
        uberApp.open();


    }
}
