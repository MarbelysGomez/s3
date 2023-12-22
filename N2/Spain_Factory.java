package s301.N2;

public class Spain_Factory implements Phonebook{
    @Override
    public Address createAddress(String street, String city, String state, String zipcode) {
        return new Spain_Address(street, city, state, zipcode);
    }
    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new Spain_PhoneNumber(number);
    }
}
