package day_59_polymorphism_exceptions;

public class WebElementUtil {
    /**
     * method with polymorphic parameter.
     * WebElement element and can accept any child class object
     * lake Link,InputFoeld etc
     * clickElement(new Link());
     * Webelement element=new Link()
     *
     */
    public static void clickElement(WebElement element){
        System.out.println("clicking on Element");
        element.click();
    }
    public static WebElement getLinkWithText(String txt){
        System.out.println("Searching for a link with txt "+txt);
        return new Link();

    }
}
