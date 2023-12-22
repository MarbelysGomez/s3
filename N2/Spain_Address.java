package s301.N2;
public class Spain_Address implements Address{
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public Spain_Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    @Override
    public void displayAddress() {
        System.out.println("The address of the headquarters in Spain is: " + this.street + ", " + this.city + ", "
                + this.state + ", " + this.zipcode + ".");
    }
}
