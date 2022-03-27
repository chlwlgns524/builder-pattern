package myBuilder.account;

import lombok.AllArgsConstructor;
import lombok.Data;


public abstract class Account {

    protected String koName;
    protected String phoneNumber;

    public Account(String koName, String phoneNumber) {
        this.koName = koName;
        this.phoneNumber = phoneNumber;
    }

    public String getKoName() {
        return koName;
    }

    public void setKoName(String koName) {
        this.koName = koName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "koName='" + koName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
