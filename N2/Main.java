package s301.N2;

public class Main {
    public static void main(String[] args) {

        Phonebook venezuelaFactory = new Venezuela_Factory();
        Phonebook spainFactory = new Spain_Factory();

        PhoneNumber venezuelaPhoneNumber = venezuelaFactory.createPhoneNumber("414-205-33-82");
        venezuelaPhoneNumber.displayPhoneNumber();

        Address venezuelaAddress = venezuelaFactory.createAddress("Calle 5", "Caracas", "Miranda", "10100");
        venezuelaAddress.displayAddress();

        PhoneNumber spainPhoneNumber = spainFactory.createPhoneNumber("932-479-516");
        spainPhoneNumber.displayPhoneNumber();

        Address spainAddress = spainFactory.createAddress("Carrer de Boronat", "Barcelona", "Cataluña", "08018");
        spainAddress.displayAddress();
    }
}
