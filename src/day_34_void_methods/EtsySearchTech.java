package day_34_void_methods;

public class EtsySearchTech {
    public static void main(String[] args) {
        System.out.println("******Starting ETSY search smoke test*******");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoone();
        verifyResultsAreDisplayed();
        System.out.println("- Etsy Search Smoke Test completed - PASS - ");
    }
    public static void openBrowser(){
        System.out.println("1 - Launching Chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("2 - Navigating to https://Etsy.com/");
    }
    public static void searchForWoodenSpoone(){
        System.out.println("3 - Pass: Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden Spoon' in search field and click search");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("4 - Pass Search results are successfully displayed");
    }

}
