package s301.N2;
public class Venezuela_PhoneNumber implements PhoneNumber {
    private static final String COUNTRY_CODE = "58";
    private String number;

    public Venezuela_PhoneNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public void displayPhoneNumber() {
        System.out.println("The telephone number of the headquarters in Venezuela is: " + COUNTRY_CODE + "-" + this.number);
    }
}
