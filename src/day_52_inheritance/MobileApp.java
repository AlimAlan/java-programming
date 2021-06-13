package day_52_inheritance;

public class MobileApp {
    String name;
    int version;
    protected boolean download(){
        System.out.println("App: "+name+" version: " +version+" is download");
        return true;
    }
    public void useTheApp(int minutes){
        System.out.println("Using "+name+" app for "+minutes+" minutes");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
