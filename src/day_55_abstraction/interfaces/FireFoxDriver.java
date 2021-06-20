package day_55_abstraction.interfaces;

public class FireFoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FireFox is navigating to "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FireFox is locating by "+locator);
    }

    @Override
    public void quit() {
        System.out.println("FireFox is quiting the driver");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
