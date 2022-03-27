package myBuilder.account;

public class GameAccount extends Account {

    private String nickName;

    public GameAccount(String koName, String phoneNumber, String nickName) {
        super(koName, phoneNumber);
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "GameAccount{" +
                "koName='" + koName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

}
