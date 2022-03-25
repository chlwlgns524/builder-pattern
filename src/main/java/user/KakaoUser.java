package user;

public class KakaoUser {

    private String koName;
    private String enName;
    private Email email;
    private String phoneNumber;

    public KakaoUser() {
    }

    public KakaoUser(String koName, String enName, int age, Email email, String phoneNumber) {
        this.koName = koName;
        this.enName = enName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getKoName() {
        return koName;
    }

    public void setKoName(String koName) {
        this.koName = koName;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
