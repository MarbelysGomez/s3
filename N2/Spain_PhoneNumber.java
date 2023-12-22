package s301.N2;
public class Spain_PhoneNumber implements PhoneNumber {
    private static final String COUNTRY_CODE = "34";
    private String number;

    public Spain_PhoneNumber(String number) {
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
        System.out.println("The telephone number of the headquarters in Spain is: " + COUNTRY_CODE + "-" + this.number);
    }
}
