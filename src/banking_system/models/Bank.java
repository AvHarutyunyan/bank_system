package banking_system.models;

import java.util.List;

public class Bank {
    private String name;
    private Address address;
    private List<Holder> holders;

    public Bank(String name, Address address, List<Holder> holders) {
        this.name = name;
        this.address = address;
        this.holders = holders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Holder> getHolders() {
        return holders;
    }

    public void setHolders(List<Holder> holders) {
        this.holders = holders;
    }
}
