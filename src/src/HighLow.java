import java.util.Random;
import java.util.Scanner;

public class HighLow {

    //game picks a random # 1-100. prompt user to guess it. validate the user inputs. if guess < the #, tell user HIGHER
    //if guess > #, tell user LOWER. if they guess it, say GOOD GUESS!     use the .random method


    public static void highLow() {

        boolean goodGuess = false;
        int theNum;

        System.out.println("Generating a number from 1-100...");
        theNum = randomNum();

        System.out.println("Got one! Now guess what the # is? ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        System.out.printf("You chose the # %d", userInput);

        do {
            if (theNum > userInput) {
                System.out.println("HIGHER");

            } else if (theNum < userInput) {
                System.out.println("LOWER");

            } else {
                System.out.println("GOOD GUESS!");
                goodGuess = true;
                break;
            }
        } while (goodGuess == false);





    }

    public static int randomNum() {
        int min = 1;
        int max = 100;
        Random random = new Random();
        int value = random.nextInt(max + min) + min;

        System.out.println(value);

        return value;
    }





    public static void main(String[] args) {

        highLow();
    }
}
