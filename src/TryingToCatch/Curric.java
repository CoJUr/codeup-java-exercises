package TryingToCatch;

import java.util.Scanner;

public class Curric {

    public static void main(String[] args) throws WrongIndentationTypeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();

        if (indentationPreference.equals("tabs")) {
            WrongIndentationTypeException e;
            e = new WrongIndentationTypeException("Spaces are superior!");
            throw e;
        }
    }
}
