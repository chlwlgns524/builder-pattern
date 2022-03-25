import account.Account;
import account.BankAccount;
import account.GameAccount;
import builder.AccountBuilder;
import builder.BankAccountBuilder;
import builder.GameAccountBuilder;
import org.jetbrains.annotations.NotNull;
import user.Email;
import user.KakaoUser;

public class Main {
    public static void main(String[] args) {
        KakaoUser user = createKakaoUser();

        Account bankAccount = accountDirector(new BankAccountBuilder(), user);
        Account gameAccount = accountDirector(new GameAccountBuilder(), user);

        System.out.println((BankAccount)bankAccount);
        System.out.println((GameAccount)gameAccount);
    }

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

    public static @NotNull KakaoUser createKakaoUser() {
        KakaoUser user = new KakaoUser();

        user.setKoName("라이언");
        user.setEnName("Ryan");
        user.setEmail(new Email("friendsRyan", "google"));
        user.setPhoneNumber("010-1234-5678");

        return user;
    }

}
