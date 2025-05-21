package banking_system.enums;

public enum Currency {
    AMD(300), USD(900), RUB(700);

    private double interest;

    Currency(double interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
