package s301.N2;

public interface Phonebook {

    Address createAddress(String street, String city, String state, String zipcode);

    PhoneNumber createPhoneNumber(String number);
}
