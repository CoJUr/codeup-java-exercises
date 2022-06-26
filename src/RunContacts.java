import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.createFile;

public class RunContacts {


    public static void main(String[] args) {
        createFileSystem();
        menuSystem();
    }

    public static void menuSystem() {
        boolean flag = true;

        do {
            System.out.println("""
                    Press 1 to view contacts
                    Press 2 to add new contact
                    Press 3 to search for contacts
                    Press 4 to delete an existing contact.
                    Press 5 to Exit
                    Enter your choice:""");

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next(); //nextLine?

            switch (userInput) {
                case "1" -> displayContacts();
                case "2" -> addContact();
                case "3" -> searchContacts();

//                    System.out.println();
                case "4" -> deleteContacts();
                case "5" -> {
                    System.out.println("Have a nice day");
                    flag = false;
                }
            }

        } while (flag);
    }


    public static String directory = "data";

    public static String filename = "contacts.txt";

    public static void addContact() {

        try {
            //get filepath of directory
            Path dataDirectory = Paths.get(directory);

            //get filepath within directory for contacts.txt
            Path dataFile = Paths.get(directory, filename);

            //get first name
            System.out.println("Please enter a first name: ");
            Scanner firstNameScanner = new Scanner(System.in);
            String firstName = firstNameScanner.next();

            //get last name
            System.out.println("Please enter last name:");
            Scanner lastNameScanner = new Scanner(System.in);
            String lastName = lastNameScanner.next();

            //get phone #
            System.out.println("Please enter phone #: ");
            Scanner phoneNumberScanner = new Scanner(System.in);
            String phoneNumber = phoneNumberScanner.next();

            //concat 1st + last
            String fullName = firstName + " " + lastName;

            //format the contact being placed in contacts.txt    addSpaces() formats it while the contact goes in
            String formattedContactLine = addSpaces(fullName) + " | " + phoneNumber;

            if (Files.exists(dataFile)) {
                //Files.write(Path path, List <> data)
                System.out.println("Writing contacts.txt file...");
                // add a new name to the file
                Files.write(dataFile, Arrays.asList(formattedContactLine), StandardOpenOption.APPEND); //.WRITE?
            }

        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }

    //method for adding spaces to full name while outputting to file
    public static String addSpaces(String fullName) {

        int gap = 21 - fullName.length();
        String gapString = "";

        switch (gap) {
            case 14:
                gapString = "              ";
            case 13:
                gapString = "             ";
            case 12:
                gapString = "            ";
            case 11:
                gapString = "           ";
            case 10:
                gapString = "          ";
            case 9:
                gapString = "         ";
            case 8:
                gapString = "        ";
            case 7:
                gapString = "       ";
            case 6:
                gapString = "      ";
            case 5:
                gapString = "     ";
            case 4:
                gapString = "    ";
            case 3:
                gapString = "   ";
            case 2:
                gapString = "  ";
            case 1:
                gapString = " ";
        }
        return fullName + gapString;
    }

    public static void displayContacts() {

        try {

            //create list of strings to rep the file data
            List<String> fileData = Files.readAllLines(Paths.get(directory, filename));

            //print header
            printHeader();

            //print out each line in contacts.txt
            for (String line: fileData) {
                System.out.println(line);
            }
            System.out.println();

        }
        catch ( IOException iox ) {
            System.out.println("iox Exception!");
            iox.printStackTrace();
        }
    }

    public static void printHeader () {
        System.out.println("         Name         |      Number");
        System.out.println("----------------------|------------------");
    }

    public static void createFileSystem() {

        try {

            // get filepath for directory
            Path dataDirectory = Paths.get(directory);

            //get filepath to specific file
            Path dataFile = Paths.get(directory, filename);

                                //FILES CLASS: contains static methods to manipulate files
                                //Files.exists() / Files.notExists -- returns boolean

            //create a directory if .notExists = true
            if (Files.notExists(dataDirectory)) {
                System.out.println("Creating new directory with name: " + dataDirectory);

                        //Files.createDirectories(Path path)  returns a Path
                Files.createDirectories(dataDirectory);
                //  ^passing the desired Path
            }
            //create a file in the above location if it doesn't exist
            if (Files.notExists(dataFile)) {
                System.out.println("New file created: " + dataFile);

                //Files.createFile(Path path) also returns a Path
                createFile(dataFile);
            }

        } catch ( IOException iox ) {
            System.out.println("Exception when trying to create/get file and/or directory!");
            iox.printStackTrace();
        }

    }

    //method for searching contacts
    public static void searchContacts() {

        try {

            //prompt user for query
            System.out.println("Please enter a contact to search for: ");
            Scanner scannerSearch = new Scanner(System.in);
            String query = scannerSearch.next();

            //create list of strings which reps file data
            List<String> fileData = Files.readAllLines(Paths.get(directory, filename));

            //boolean to track if query succeeded
            boolean querySuccess = false;

            //print and loop through each line in contacts.txt
            boolean headerPrinted = false;
            for (String line: fileData) {
                if (line.toLowerCase().contains(query)) {
                    if (!headerPrinted) {
                        printHeader();
                        //first time through search?
                    }
                    System.out.println(line);
                    querySuccess = true;
                    //make true since found contact
                    headerPrinted = true;
                    //make true since found contact and printed header
                }
            }

            //print out message for when query doesn't find anything
            if (!querySuccess) {
                System.out.println("Sorry, no results found");
            }

        } catch ( IOException iox ) {
            System.out.println("Error during query process");
            iox.printStackTrace();
        }
    }

    public static void deleteContacts() {

        try {

            //ask user for contact
            System.out.println("Please enter a contact to delete: ");
            Scanner scannerSearchDelete = new Scanner(System.in);
            String searchDeleteItem = scannerSearchDelete.next();

            //list of strings which reps file data
            List<String> fileData = Files.readAllLines(Paths.get(directory, filename));

            //new list to dump data
            List<String> newList = new ArrayList<>();

            //boolean to track if search successful
            boolean searchItemFound = false;

            //loop thru each line of contacts.txt to find searchDeleteItem
            for (String line : fileData) {

                //ask if found item/line is the desired
                if (line.toLowerCase().contains(searchDeleteItem)) {
                    System.out.printf("Found search info: %s  -  ", line);
                    System.out.print("Is this the information you want deleted? (y/n)");
                    Scanner askDelete = new Scanner(System.in);
                    String deleteYesOrNo = askDelete.next().toLowerCase();

                    //if yes delete, skip process of adding to newList
                    if (deleteYesOrNo.equals("y")) {
                        continue;
                    }
                    searchItemFound = true; // why here?
                }
                //else {   if not being deleted, add it to newList
                newList.add(line);
            }

            //print msg if search item not found
            if (!searchItemFound) {
                System.out.println("Sorry, didn't find any such record");

            //else write addList to the contacts.txt file, overwriting with updated content without the desired deletion
            } else {
                Files.write(Paths.get(directory, filename), newList);
            }

        } catch ( IOException iox ) {
            System.out.println("Exception when performing deleteContacts():");
            iox.printStackTrace();
        }


    }


}
