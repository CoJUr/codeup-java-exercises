import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        System.out.println(doAddition(4, 5));
//        System.out.println(doSubtraction(5, 5));
//        System.out.println(doDivision(10, 2));
//        System.out.println(doMultiplication(3, 3));
//        System.out.println(findRemainder(4, 2));
//        System.out.println(sayHello("Adrian"));
//        sayHello("Hey", "you");
//        System.out.println(shout("hey"));

//        System.out.println(getInteger( 1, 10));

//        calculateFactorial();

//        getNum1(1, 6);
        rollDice();
    }



    public static int doAddition(int x, int y) {

        return x + y;
    }

    public static int doSubtraction(int x, int y) {

        return x - y;
    }

    public static int doMultiplication(int x, int y) {

        return x * y;
    }

    public static int doDivision(int x, int y) {

        return x / y;
    }

    public static int findRemainder(int x, int y) {

        return x % y;
    }

    public static String sayHello(String name) {
        return String.format("Hello %s!", name);
    }

    public static void sayHello(String greeting, String name) {
        System.out.printf("%s, %s!\n", greeting, name);
    }

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }

//    public static int doMultiply(int x, int y) {
//
//        int product;
//        for (int i = 0; i < x; i++) {
//

//        }
//
//    }


    //2) create a method that validates if user input is in a certain range. return that in-range input as an int.
    //if not in range, pormp user to input the # again.

    public static int getInteger(int min, int max) {


        System.out.println("please enter a number from 1 to 10");

        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();

        while (userNumber < 1 || userNumber > 10) {
            System.out.println("please just stay in the range provided");
            System.out.println("pick a number from 1-10");
             userNumber = sc.nextInt();
        }

        return userNumber;

    }

//    public static int calculateFactorial() {
        //3 prompt to enter an int from 1-10. display the factorial of entry. ask to continue. for-loop to calulcate.
        //verify entry is 1-10. store the factorial with long.

                //walkthru-----
                //public static long factorial (int num) {
        //             long output = 1;
        //              for (int i = 1; i <= num; i+= 1) {
        //                  output *= i;
        //              }
        //             return output;
        //    }
                        //-------walkthru B==== recursive
//                        public static long factorial(int num) {
//                        if (num == 1) return 1;
//                        return factorial(num - 1 )  * num;
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a # between 1 and 10!");
//        int userInput = sc.nextInt();
//
//        if (userInput < 1 || userInput > 10) {
//            System.out.println("sorry pick again");
//            calculateFactorial();
//        }
//
//        System.out.println("you choose the number : " + userInput);
//        long factorial = 1;
//
//        for (int i = userInput; i > 0 ; i--) {
//
//            factorial *= i;
//
//        }
//
//        System.out.println("the factorial works out to: " + factorial);
//
//
//        System.out.println("want to go again?   y/n ");
//        String again = sc.next();
//
//        if (again.equals("y"))
//            calculateFactorial();
//
//        return -1;
//    }





//}

    //create a dice rolling sim. ask user for number sided die pair. prompt them to roll. display the results of each roll.
    //then ask to continue. static methods generate the random numbers using .random
    public static int getNum (int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));

    }
    public static int rollDice() {
//                int min = 1;
//        int max = 10;
//        Random random = new Random();
//        int value = random.nextInt(max + min) + min;

//        System.out.println(value);
        System.out.println("How many sides do you want for your dice? ");
        int sidedDice = getInteger(1, 10);
        System.out.println("# of sides: " + sidedDice + "\n Rolling....");
        System.out.printf("You rolled a %d and a %d !", getNum(1, sidedDice), getNum(1, sidedDice));



//        getNum1(int min, int max);
        return -1;
    }

    //5. high-low game. prompt user for # between 1-100. generate another # 1-100 for the user




}

