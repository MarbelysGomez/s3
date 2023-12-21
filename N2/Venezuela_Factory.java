package s301.N2;

public class Venezuela_Factory implements Phonebook {

    @Override
    public Address createAddress(String street, String city, String state, String zipcode) {
        return new Venezuela_Address(street, city, state, zipcode);
    }
    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new Venezuela_PhoneNumber(number);
    }
}
