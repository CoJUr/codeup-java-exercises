import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactsManager {

    Scanner scanner = new Scanner(System.in);

    protected String directory = "Contacts";
    protected String fileName = "contacts.text";

    public void createContactList() {
        //creating the list initially only

        try {
            Path contactDirectory = Paths.get(directory);
            Path contactFile = Paths.get(directory, fileName);

            if (Files.notExists(contactDirectory)) {
                System.out.println("Creating directory: " + contactDirectory);
                Files.createDirectories(contactDirectory);
            }

            if (Files.notExists(contactFile)) {
                System.out.println("New file created: " + contactFile);
                Files.createFile(contactFile);
            }

            List<String> contactText = new ArrayList<>();
            contactText.add("Bo Jankins | 1231231234 |");
            contactText.add("Hill Hank | 2342342345 |");
            contactText.add("Bill Billy | 4352642345 |");
            contactText.add("Jill Swanks | 2892347645 |");
            contactText.add("Doctor Frank | 8762342079 |");

        } catch (IOException e) {
            System.out.println("Error creating contact list: ");
            e.printStackTrace();
        }
    }

    public void addContact() {

        try {
            Path contactFile = Paths.get(directory, fileName);
            System.out.println("Please enter a contacts first and last names: ");
            String nameInput = scanner.nextLine();
            System.out.println("Please enter contacts phone number: ");
            boolean willRunNum = true;

            do{
                String numInput = scanner.nextLine();
                if (nameInput.length() == 10 || nameInput.length() == 7) {
                    numInput = numberFormat(numInput);
                    Files.write(contactFile, List.of(nameInput + " | " + numInput + " | "), StandardOpenOption.APPEND);
                    willRunNum = false;

                } else {
                    System.out.println("Invalid #; please enter either a 7 or 10 digit #");
                }
            } while (willRunNum);

        } catch( IOException e ) {
            System.out.println("Exception during addContact() : ");
            e.printStackTrace();
        }

    }


    public void deleteContact() {
        try {
            List<String> contactData = Files.readAllLines(Paths.get(directory, fileName));
            System.out.println("Please enter a contact to be deleted: ");
            String input = scanner.nextLine();

            List<String> newList = new ArrayList<>();

            for (String contact : contactData) {
                if (contact.contains(input)) {
                    continue;
                    //skipping the adding of the contact in order to 'delete them' from newList instead of .remove
                }
                newList.add(contact);
            }

            Files.write(Paths.get(directory, fileName), newList);
            //overwriting and updating the list
            contactData = Files.readAllLines(Paths.get(directory, fileName));

            printList();
            // showing updated list at end

        } catch (IOException iox ) {
            System.out.println("Exception when running deleteContact() : ");
            iox.printStackTrace();
        }


    }

    public void printList() {
        try {
            List<String> contactData = Files.readAllLines(Paths.get(directory, fileName));
            System.out.println("Name | Phone number\n");

            for (String contact: contactData) {
                System.out.println("contact: " + contact);
                //looping through all contacts to sout them out
            }
            System.out.println(""); //?

        } catch (IOException e ) {
            System.out.println("Exception while running printList() :");
            e.printStackTrace();
        }
    }

    public void searchContact() {

        try {
            List<String> contactData = Files.readAllLines(Paths.get(directory, fileName));
            System.out.println("Please enter the contact name for your search: ");
            String input = scanner.nextLine();
            System.out.println("Name | Phone number\n");

            for (String contact : contactData) {
                if (contact.contains(input)) {
                    System.out.println("contact found: " + contact);
                }
            }
            System.out.println("");//?

        } catch (IOException iox) {
            System.out.println("Exception while running searchContact():");
            iox.printStackTrace();
        }
    }

    public String numberFormat(String num) {
        try {
            if (num.length() == 10) {
                String one = num.substring(0, 3);
                String two = num.substring(3, 6);
                String three = num.substring(6);
                return "(" + one + ") " + two + "-" + three;
            }

            if (num.length() == 7) {
                return num.replaceFirst("(\\d{3})(\\d+)", "$1-#2");
            }

        } catch (Exception e) {
            System.out.println("Error while formatting number: ");
            e.printStackTrace();
        }
        return num;
    }


}
