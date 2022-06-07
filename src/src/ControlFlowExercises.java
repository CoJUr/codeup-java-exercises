public class ControlFlowExercises {

    public static void main(String[] args) {

////        1. loop basics
////        while -- create an integer var i with value 5
//        int i = 5;
//        //create a while loop that runs long as i is < or = 15
//        //each loop iteration, output the current value of i, then increment i
//        while ( i <=15 ) {
//            System.out.println("the value of i is: " + i + "  before incrementing");
//            i++;
//        }
//        int i = 0;
        //do-while -- create a do-while that counts by 2s starting at 0 ending at 100; print on newlines
//        do {
//
//            System.out.println(i);
//            i+=2;
//        }
//        while (i <= 100);

        //alter the do-while to count backwards by 5s from 100 to -10
//        int i = 100;
//        do {
//
//            System.out.println(i);
//            i-=5;
//        }
//        while (i >= -10);


        //create a do-while that starts at 2 and displays the number squared on each line until 1,000,000
//        double i = 2;
//        do {
//            System.out.println("before increment i = " + i);
//            i = Math.pow(i, 2);
////            System.out.println(Math.pow(i, 2));
//
//        }
//        while ( i < 1000000);

//        1. loop basics - FOR LOOP STYLE
        //create a FOR loop that runs long as i is < or = 15
        //each loop iteration, output the current value of i, then increment i
//        int i = 5;
//
//        for (i = 0; i <= 15; i++) {
//            System.out.println("in the loop, i is = " + i );
//        }
//
//        //create a FOR that counts by 2s starting at 0 ending at 100; print on newlines
//
//        for (i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }

        //create a FOR that starts at 2 and displays the number squared on each line until 1,000,000
        double i;
        for (i = 2; i < 1000000; i*=i) {
            System.out.println(i);
        }
//        do {
//            System.out.println("before increment i = " + i);
//            i = Math.pow(i, 2);
////            System.out.println(Math.pow(i, 2));
//
//        }
//        while ( i < 1000000);


    }

}
