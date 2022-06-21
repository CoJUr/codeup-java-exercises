package TryingToCatch;

public class CheckedVsUnchecked2 {

    //unchecked exceptions: -Runtime-
    //NullPointer  NumberFormat   ClassCast  IndexOutOfBounds
    //java wont check to see if you're dealing with them before compile time



    public static void main(String[] args) {
        String name = null;
        //if myString is null, get NullPointerException
        printLength(name);
    }


    private static void printLength(String myString) {
        try {
            System.out.println(myString.length());
        } catch (NullPointerException e) {
            System.out.println("String cannot be null");
        }

    }
}
