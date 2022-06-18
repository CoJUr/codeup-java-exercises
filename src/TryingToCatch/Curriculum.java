package TryingToCatch;

import java.util.Scanner;

public class Curriculum {

    public static void main(String[] args) throws Exception {


        int[] numbers = {1, 2, 3};
        int x;

        try {
            x = numbers[100];

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Caught an array index exception!");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("caught a generic exception");

        } finally {
            System.out.println("this always runs");
        }


//        getIndentationPreference();

        String indentationPreference = getIndentationPreference();
        System.out.println("ok... " + indentationPreference + " is actually gr8");

//        try{
//            indentationPreference = getIndentationPreference();
//            System.out.println("Ok " + indentationPreference + " is a great choice");
//        } catch (Exception e) {
//            System.out.println("oh no something went bad: " + e.getMessage());
//            System.out.println("Heres more detail: ");
//            e.printStackTrace();
//
//        }

    }


    public static String getIndentationPreference() throws Exception {
        //this works without try-catch because of signature ^

        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your fav indentation?");
        String indentationPreference = sc.nextLine();

        if (indentationPreference.equals("tabs")) {
            throw new WrongIndentationTypeException("They said tabs; was expecting spaces.");

        }

        return indentationPreference;
    }



}
