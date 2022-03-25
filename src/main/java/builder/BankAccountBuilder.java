package builder;

import account.Account;
import account.BankAccount;
import user.Email;

public class BankAccountBuilder extends AccountBuilder {

    private String enName;
    private Email email;
    private BankAccount bankAccount;

    public BankAccountBuilder withEnName(String enName) {
        this.enName = enName;
        return this;
    }

    public BankAccountBuilder withEmail(Email email) {
        this.email = email;
        return this;
    }

    @Override
    public Account build() {
        bankAccount = new BankAccount(koName, enName, phoneNumber, email);
        return bankAccount;
    }

    @Override
    public Account getAccount() {
        return bankAccount;
    }

}
