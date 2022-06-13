package masterclass;

import java.util.Scanner;

public class ParsingFromStrings {



    public static void main(String[] args) {

//        String numberAsString = "2018.125";
//        System.out.println("numberAsString = " + numberAsString);
//
//        double number = Double.parseDouble(numberAsString);
//        System.out.println(number);
//
//        numberAsString+= 1;
//        number += 1;
//
//        System.out.println(numberAsString + " = Number as string");
//        System.out.println(number + " is the #");

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your birth year:");

        boolean hasNextInt = scanner.hasNextInt(); //checks to see if user entered integer. if not, then false.
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2022 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("your name is " + name + " , and your age is : " + age);
            } else {
                System.out.println("invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse YoB");
        }




        scanner.close();



    }


}
