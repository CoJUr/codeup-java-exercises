package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {





    Scanner sc;

    public static void main(String[] args) {
        Input input1 = new Input();



        System.out.println("What would you like to do?");
        System.out.println("""

                0 - exit\s
                1 - view all movies\s
                2 - view movies in the animated category
                3 - view movies in the drama category\s
                4 - view movies in the horror category
                5 view movies in the scifi category""");
        String userInput = input1.getScanner();
//        String nextAction = Input.getScanner.nextLine();

    }
}
