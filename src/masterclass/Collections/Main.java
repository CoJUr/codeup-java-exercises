package masterclass.Collections;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        theatre.getSeats();   //comment out test to confirm its working and seats are being generated
        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat taken");
        }
        //copy paste it onto itself so it verifies h11 was taken, means previous call worked
        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat taken");
        }
    }

}
