import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
        String cohort = "Go";
        String timeOfDay = "afternoon";
        byte week = 11;
        float someNumber = 123.456F;
//        System.out.printf("Good%s, %s!%n", timeOfDay, cohort );  //%s for string substitution
//        System.out.printf("This is the %dth week of %s cohort. %n", week, cohort );
//        System.out.println("This is actually going to appear on the next line");
//        System.out.printf("The chosen number is %-8.2f%n", someNumber); //rounds to the 2nd decimal place


        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string");
//        String userInput = scanner.nextLine();
//        System.out.printf("Your output was %s", userInput);

        System.out.println("enter an integer : ");
        int userInput = Integer.parseInt(scanner.nextLine()); //not use nextInt, but nextLine instead. then parse to an int -#2
        System.out.println("You entered " + userInput);

        String first;
        String second;
        System.out.println("Please enter a sentence: ");
//        String ghost = scanner.nextLine(); //ghost line takes up the returnbutton's keyup event - #1 strat



        first = scanner.nextLine();
        System.out.println("please enter another sentence: ");
        second = scanner.nextLine();
        System.out.println("First sentence: " + first + "\n second sentence: " + second);

    }





}
