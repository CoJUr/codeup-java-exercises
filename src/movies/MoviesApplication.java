package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {





    Scanner sc;

    public static void main(String[] args) {
        Input input1 = new Input();



        System.out.println("What would you like to do?");
        System.out.println("\n0 - exit \n1 - view all movies \n2 - view movies in the animated category" +
                "\n3 - view movies in the drama category \n4 - view movies in the horror category" +
                "\n5 view movies in the scifi category");
        String userInput = input1.getScanner();
//        String nextAction = Input.getScanner.nextLine();

    }
}
