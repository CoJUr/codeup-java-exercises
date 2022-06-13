package masterclass;

import java.util.Scanner;

public class UserInputCh {

    //read 10 #s from user and print their sum. usehasNextInt() to check if entered int vals. if returns false, print "invalid".
    //continue reading until have 10 #s. use the nextInt() to get the # and add to the sum. before user enters each #, tell them to
    //enter the # of the count. i.e. the 1st msg to the user would be 'enter #1'

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(true) { //or do counter < 10 for condition instead of line 25
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int inputNumber = scanner.nextInt();   //captures user input IF it isAnInt
                counter++;
                sum+= inputNumber;
                if(counter == 10) break;
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); //handle end of line enter key
        }
        System.out.println("total sum: " + sum);


//        scanner.close();
    }

}
