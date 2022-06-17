import java.util.Scanner;

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


                //walkthru--------
//                int num = 5;
//                while (num <= 15) {
//             System.out.print(num + " ");//print bc want it all in 1 line.
//                    num++;
//              }



        //do-while -- create a do-while that counts by 2s starting at 0 ending at 100; print on newlines
//        do {
//
//            System.out.println(i);
//            i+=2;
//        }
//        while (i <= 100);

//                      walkthru------
//                int num = 0;
//                do {
//                    System.out.println(num);
//                    num += 2;
//                } while (num <= 100);
//                // ----------


        //alter the do-while to count backwards by 5s from 100 to -10
//        int i = 100;
//        do {
//
//            System.out.println(i);
//            i-=5;
//        }
//        while (i >= -10);

                //walkthru ------
//                int num = 100;
//                do {
//                    System.out.println(num);
//                    num -=5;
//                } while (num >= -10);
                    //------------

        //create a do-while that starts at 2 and displays the number squared on each line until 1,000,000
//        double i = 2;
//        do {
//            System.out.println("before increment i = " + i);
//            i = Math.pow(i, 2);
////            System.out.println(Math.pow(i, 2));
//
//        }
//        while ( i < 1000000);

                //walkthru----------
//                double num = 2;
//                do {
//                    System.out.println(num);
//                    num *= num;
//                } while (num < 1000000);
                //-------------

//        1. loop basics - FOR-LOOP REFACTORING
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
//        double i;
//        for (i = 2; i < 1000000; i*=i) {
//            System.out.println(i);
//        }

        //2 fizzbuzz
        //write a program to print 1-100. if multiple of 3, print fizz instead of the num. multiple of
        //5, print buzz. if multiple of both, print FizzBuzz

//        for (i = 0; i <= 100; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("fizzbuzz");
//            }else if (i % 3 == 0) {
//                System.out.println("fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("buzz");
//            } else {
//                System.out.println(i);
//            }
//
//        }

                    //walkthru------
//            for (int i = 1; i < 100; i++) {
//                if (i % 5 == 0 && i % 3 == 0){
//                    System.out.println("fizzBuzz");
//                    continue;
//                }
//                if (i % 3 == 0) {
//                    System.out.println("Fizz");
//                    continue;
//                }
//                if (i % 5 == 0) {
//                    System.out.println("buzz");
//                    continue;
//                }
//
//                System.out.println(i);
//            }

        //3 table of powers
        //prompt user to enter an int
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number to go up to");
//        int userInput = sc.nextInt();
//
//        //display a table of squares and cubes from 1 to the value entered
//        int i;
//        for (i = 0; i <= userInput; i++) {
//            System.out.println("counter = " + i);
//            System.out.println("squared: " + Math.pow(i, 2));
//            System.out.println("cubed: " + Math.pow(i, 3));
//
//        }

                //table of talkthru -------
//                Scanner sc = new Scanner(System.in);
//                boolean willContinue = false;
//                do {
//                    System.out.println("please enter a number");
//                    int userInt = sc.nextInt();
////                System.out.println(userInt + " | " + userInt * userInt + " | " + Math.pow(userInt, 3));
//
//                    for (int i = 1; i <= userInt; i++) {
//                        System.out.println(i + " | " + i * i + " | " + (int) Math.pow(i, 3));
//                    }
//                }
//                    System.out.println("do you want another number? y/n");
//                    String userResponse = sc.next();
//                    if (userResponse.equals("y")) {
//                       willContinue = true;
//                    } else {
//                        willContinue = false;
//                    }



        //4) convert given number grades from the user into displayed letter grades
        //walkthru ---
        Scanner sc = new Scanner(System.in);

        boolean anotherGrade = true;  //if user doesnt enter y, changes to false

        do {
            System.out.println("please enter a numerical grade");


            int numericGrade = sc.nextInt();

            if (numericGrade >= 88) {
                System.out.println("A");
            } else if (numericGrade >= 80) {
                System.out.println("B");
            } else if (numericGrade >= 67) {
                System.out.println("C");
            } else if (numericGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Go again?  y/n ");
            String userChoice = sc.next();

            if (!userChoice.equalsIgnoreCase("y")) {
                anotherGrade = false;
            }
        } while (anotherGrade);



        //convert given number graddes into letter grades
        //prompt user for number from 0 - 100. display the corresponding letter
//        System.out.println("Please enter a number from 0 to 100 for your grade");
//        int userNum = sc.nextInt();
//
//        switch (userNum) {
//            case 100 -> System.out.println("One vanilla coming up");
//            case 40 -> System.out.println("one chocolate coming up");
//            case 50 -> System.out.println("one strawberry...");
//            default -> System.out.println("we don't have that");
//        }


    }

}
