package account;

import user.Email;

public class BankAccount extends Account {

    private String enName;
    private Email email;

    public BankAccount(String koName, String enName, String phoneNumber, Email email) {
        super(koName, phoneNumber);
        this.enName = enName;
        this.email = email;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "koName='" + koName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", enName='" + enName + '\'' +
                ", email=" + email.getEmailAddress() +
                '}';
    }

}
