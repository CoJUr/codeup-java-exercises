package masterclass.Collections;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>(); //seats field

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        //allocate a seat # consiting of row and seat numbers
        int lastRow = 'A' + (numRows - 1);
        //create seats
        for (char row = 'A'; row <= lastRow; row++) { //goes thru rows from A - Z
            //loop thru and allocate all the seats for each row
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum)); // 02d to add leading zero to seats for ex.A 1 instead 01
                seats.add(seat);//now add it to arraylist
            }
        }
    }

    public Theatre(String theatreName) {
        this.theatreName = theatreName;
    }

    //reserve seats and create a method to print out seats

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;

        //searching through seats
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break; // got a seat
            }
        }
        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.reserve();
    }

    //for testing
    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat {
        private final String seatNumber;
        private boolean reserved = false; // to track if the seat has been reserved or not

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) { //if the seat had been reserved
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " Canceled.");
                return true; //because success!
            } else {
                return false; //not success. seat was already filled
            }

        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
