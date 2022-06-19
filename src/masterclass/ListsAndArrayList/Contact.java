package masterclass.ListsAndArrayList;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact() {}

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //expose a public static method to create a new contact record. used to access functions in mobilephone without creating a new obj
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber); //calling the constructor to create new contact record
    }
}
