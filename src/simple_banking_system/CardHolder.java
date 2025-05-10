package simple_banking_system;

public class CardHolder {
    Address address;
    private int holderId;
    public String fullName;

    CardHolder(int holderId , String fullName , Address address){
        this.address = address;
        this.holderId = holderId;
        this.fullName = fullName;
    }

    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }


}
