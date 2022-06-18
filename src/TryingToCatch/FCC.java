package TryingToCatch;

public class FCC {

    public static void main(String[] args) {


        try {
            throw new Error("my error");
        }  catch (Exception e) {
            System.out.println(e.getMessage());        }
    }


}
