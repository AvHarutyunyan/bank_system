package banking_system.models;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private int house;

    public Address(String country, String region, String city, String street, int house) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return " country = " + country + "\n" +
                " region = " + region + "\n" +
                " city = " + city + "\n" +
                " street = " + street + "\n" +
                " house = " + house;
    }
}
