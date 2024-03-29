package RPS;

import java.util.Random;
import java.util.Scanner;

public class Program {
//    valid user input = rock paper scissors/scissor   r p s

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            if (sc.hasNext()) {
                String userInput =
                        quickFormat(sc.next());
                sc.close();

                if (isValid(userInput)) {
                    game(userInput);
                } else {
                    displayInputs();
                }
            } else {
                displayInputs(); // null value, display correct inputs
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void game(String user) {
        String computer = computerResults();

        print(user + " vs " + computer + "\n");

        if (user.equalsIgnoreCase(computer)) {
            print("Tie");
        } else {
            if (checkWin(user, computer)) {
                print("You win");
            } else {
                print("You lose =(");
            }
        }
    }

    public static String computerResults() {
        String types[] = {"rock", "paper", "scissors"};

        Random rand = new Random();
        int computerChoice = rand.nextInt(3);

        return types[computerChoice];
    }

    public static boolean isValid(String input) {

        switch (input.toLowerCase()) {
            case "rock":
            case "scissors":
            case "paper":
                return true;
            default:
                return false;
        }
    }

    public static boolean checkWin(String user, String opponent) {

        if ( (!isValid(user)) || (!isValid(opponent)) ) {
            return false;
        }

        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";

        if (user.equalsIgnoreCase(rock) && (opponent.equalsIgnoreCase( scissors ))) {
            return true;
        }

        if ( (user.equalsIgnoreCase(scissors)) && (opponent.equalsIgnoreCase( paper)) ) {
            return true;
        }

        if ( (user.equalsIgnoreCase(paper)) && (opponent.equalsIgnoreCase( rock)) ) {
            return true;
        }
        return false;
    }

    public static void displayInputs() {
        print("Invalid user input! Enter rock, paper or scissors");
    }

    public static void print(String text) {
        //easier print method
        System.out.println( text );
    }

    public static String quickFormat(String input) {
        //shorthands inputs

        String output = input;

        switch (input.toLowerCase()) {
            case "r":
                output = "rock";
                break;
            case "p":
                output = "paper";
                break;
            case "s":
            case "scissor":
                output = "scissors";
                break;
        }
        return output;
    }
}
