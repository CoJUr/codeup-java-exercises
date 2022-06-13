package masterclass;

public class WhileAndDoWhile {


    public static boolean isEvenNumber(int num) {

        return (num % 2 == 0);


    }

    public static void main(String[] args) {

        System.out.println(isEvenNumber(7));


        //walkthru....
        int number = 4;
        int finishNumber = 20;
        int evenNums = 0;

        while (number <= finishNumber) {
            number++; //do increment first with while-loops because easy to end up with infinite loop
            if (!isEvenNumber(number)) {
                continue; //any number thats not even never reaches the sout below, loop just resets  continue == reset
            } else if (isEvenNumber(number)) {
                if (evenNums >= 5) break;
                evenNums++;
            }
            System.out.println("Even number " + number );
            System.out.println("Found another even number! evenNums is now : " + evenNums);
        }
        System.out.println("total even numbers found : " + evenNums );
        //.....
    }

//    public static boolean main(String[] args) {
//        //if don't know how many times will need to loop until a condition happens, use a while loop
////        int count = 6;
////        while (count != 6) {
////            System.out.println("Count value is " + count);
////            count++;
////        }
////
////        count = 1;
////        while (true) {
////            if (count == 6) {
////                break;
////            }
////            System.out.println("count value is : " + count);
////            count++;
////        }
////        count = 6;  //weird infinite loop because count will become 7 before evaluation.
////        do {
////            System.out.println("count value was " + count);
////            count++;
////
////            if (count > 100) break;  //failsafe. no infinite loop
////        } while (count != 6);
////
////        int num = 0;
//
//
//
//
//    }

}
