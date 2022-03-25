package builder;

import account.Account;
import account.GameAccount;
import user.Email;

public class GameAccountBuilder extends AccountBuilder {

    private String nickName;
    private GameAccount gameAccount;

    public GameAccountBuilder withNickName(Email email) {
        nickName = email.getId();
        return this;
    }

    @Override
    public Account build() {
        gameAccount = new GameAccount(koName, phoneNumber, nickName);
        return gameAccount;
    }

    @Override
    public Account getAccount() {
        return gameAccount;
    }

}
