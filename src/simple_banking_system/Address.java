package simple_banking_system;

public class Address {
    public String country;
    public String region;
    public String city;
    public String street;
    public int house;

    Address(String country , String region, String city , String street , int house){
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
    }
}
