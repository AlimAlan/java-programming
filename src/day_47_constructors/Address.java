package day_47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country="USA";
    //constructor -automatically called
    public Address(){
        System.out.println("Address constructor");
        street="123 unknown street";
        city="Unknown";
        state="Unknown";
        zipCode="00000";
    }
    //second constructor, overloaded -> provides shortcut to initialize variables
    //in same statement: ex: Address ad=new address("123 java st", "Boston", "MA","234235");
    public Address(String street, String  city, String state, String zipCode){
        this.street=street;
        setStreet(street);
        this.city=city;
        this.state=state;
       // this.
    }


    public String toString(){
        return street+", "+city+", "+state+" "+zipCode;
    }

    public String getStreet() {
        return street;
    }


    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
