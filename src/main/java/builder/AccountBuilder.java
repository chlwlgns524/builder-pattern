package builder;

import account.Account;

public abstract class AccountBuilder {

    protected String koName;
    protected String phoneNumber;

    public AccountBuilder withKoName(String koName) {
        this.koName = koName;
        return this;
    }

    public AccountBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public abstract Account build();

    public abstract Account getAccount();

}
