import java.util.Scanner;

public class ContactsManagerTest {


    public static void main(String[] args) {
        ContactsManager contactList = new ContactsManager();
        boolean proceed = true;

        do {
            System.out.println("""
                    1. View contacts
                    2. Add new contact
                    3. Search a contact name
                    4. Delete a contact
                    5. Exit
                    Enter an option: (1, 2, 3, 4, 5)""");

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "1":
                    contactList.printList();
                case "2":
                    contactList.addContact();
                case "3":
                    contactList.searchContact();
                case "4":
                    contactList.deleteContact();
                default :
                    proceed = false;

            }

        } while (proceed);
    }
}
