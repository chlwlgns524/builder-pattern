package myBuilder;

import myBuilder.account.Account;
import myBuilder.account.BankAccount;
import myBuilder.account.GameAccount;
import myBuilder.builder.AccountBuilder;
import myBuilder.builder.BankAccountBuilder;
import myBuilder.builder.GameAccountBuilder;
import org.jetbrains.annotations.NotNull;
import myBuilder.user.Email;
import myBuilder.user.KakaoUser;

public class Main {
    public static void main(String[] args) {
        KakaoUser user = createKakaoUser();

        BankAccount bankAccount = (BankAccount)accountDirector(new BankAccountBuilder(), user);
        GameAccount gameAccount = (GameAccount)accountDirector(new GameAccountBuilder(), user);

        System.out.println(bankAccount);
        System.out.println(gameAccount);
    }

    //director method
    public static Account accountDirector(AccountBuilder builder, KakaoUser user) {
        Account account;

        if (builder instanceof BankAccountBuilder) {
            account = new BankAccountBuilder()
                    .withEnName(user.getEnName())
                    .withEmail(user.getEmail())
                    .withPhoneNumber(user.getPhoneNumber())
                    .withKoName(user.getKoName())
                    .build();
        }
        else {
            account = new GameAccountBuilder()
                    .withNickName(user.getEmail())
                    .withKoName(user.getKoName())
                    .withPhoneNumber(user.getPhoneNumber())
                    .build();
        }

        return account;
    }
    
    //user 객체 생성
    public static @NotNull KakaoUser createKakaoUser() {
        KakaoUser user = new KakaoUser();

        user.setKoName("라이언");
        user.setEnName("Ryan");
        user.setEmail(new Email("friendsRyan", "google"));
        user.setPhoneNumber("010-1234-5678");

        return user;
    }

}
