package util;

import java.util.Scanner;

public class Input {

    //variables---
    private Scanner scanner;

    //----


    public String getScanner() {
        return scanner.nextLine();
    }

    //methods---
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Please enter a string:");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public boolean yesNo() {
        System.out.println("Would?  y/n");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {

        int userInput;

        do {
            System.out.println("Enter an integer between " + min + " and " + max);
            userInput = scanner.nextInt();
            if (userInput < min) {
                System.out.println("too low try again");

            } else if (userInput > max) {
                System.out.println("too high! Again");
            }

        } while (userInput < min || userInput > max);


        return userInput;
    }

//    public int getInt() {
//            System.out.println("What is your favorite number? :");
//            int userFavorite = scanner.nextInt();
//
//            return userFavorite;
//    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a decimal number between " + min + " and " + max);
        double userDbl = scanner.nextDouble();

        while (userDbl < min || userDbl > max) {
            System.out.println("Seriously please enter a double like I asked for :");
            userDbl = scanner.nextDouble();
            if (userDbl < min) {
                System.out.println("too low try again");


            } else if (userDbl > max) {
                System.out.println("too high! Again");


            } else {
                break;
            }
            System.out.println("I think you said " + userDbl );
        } return userDbl;

    }
//    public double getDouble() {
//        System.out.println("what your favorite decimal number?");
//        return scanner.nextDouble();
//    }

    public double getDouble(){
        System.out.println("Please enter the radius");
        return scanner.nextDouble();
    }



    public double getDouble(String prompt) {
        System.out.println("what is your favorite decimal number?");

        System.out.println("by the way look at this : " + prompt);

        return scanner.nextDouble();
    }



}
