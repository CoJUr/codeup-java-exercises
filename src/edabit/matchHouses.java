package edabit;

public class matchHouses {


    public static int matchHouses(int step) {

        //mine:
        if (step > 0) {
            int subtractor = step - 1;

            return (step * 6) - subtractor;
        } else {
            return 0;
        }



    }

    public static void main(String[] args) {

        System.out.println(matchHouses(4));
        System.out.println(matchHouses(0));

    }
}
