package banking_system.models.card_holder;

import banking_system.models.address.Address;

public class CardHolder {
    Address address;
    private int holderId;
    public String fullName;

    public CardHolder(int holderId, String fullName, Address address){
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
