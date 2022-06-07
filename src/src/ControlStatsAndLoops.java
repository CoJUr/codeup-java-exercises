import java.util.Scanner;

public class ControlStatsAndLoops {
    public static void main(String[] args) {

        //fundamental components
//        System.out.println("output this"); //statements


        //decisions or conditionals ==========
//        short x = 30001;
//
//        if (x < 0) {
//            System.out.println("if u see me, x is negative");
//        } else if (x >= 0 && x < 30000){
//            System.out.println("print this instead if x is positive");
//        } else {
//            System.out.println("the variable x is approaching " + Short.MAX_VALUE);
//        }
//        System.out.println("this will run regardless of x");

        //switch statements
//        String customerChoice;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What flavor icecream do u want?");
//        customerChoice = scanner.nextLine();
//        System.out.printf("%s%n", customerChoice);

//        switch (customerChoice) {
//            case "vanilla" -> System.out.println("One vanilla coming up");
//            case "chocolate" -> System.out.println("one chocolate coming up");
//            case "strawberry" -> System.out.println("one strawberry...");
//            default -> System.out.println("we don't have that");
//        }

        //initializing multiple same-type variables at once
//        int c = 0, d = 100, e = 50;
//        if ( c == 1 & e++ < 100){ // double & to allow short-circuit. single & for non-short circuit operator
//            d = 150;
//        }
//        System.out.println("e = " + e); // e = 51
//        System.out.println("d = " + d);


//        int number = 42;
//        boolean existence = true;
//
//        if (existence || number++ == 42){}
//        System.out.println(number);
//
//        if (existence | number++ == 42) {} //single | continues evaluating even if 1st part is true
//        System.out.println(number);

        //====decisions/conditionals end


        //loops ====
//        int i = 0;   //setting the loop control var
//        while (i < 10) {  //checking the value of loop control var
//            System.out.println("This is inside the loop. before incrementing. value of i is : " + i);
//            i++; //modify the control variable
//            System.out.println("this is still inside, but now control var has incremented. Now i is: " + i);
//        }

        //if must have run once always, do-while is best.
//        int i = 0;
//        do {
//            System.out.println("This is inside the loop. before incrementing. value of i is : " + i);
//            i++; //modify the control variable
//            System.out.println("this is still inside, but now control var has incremented. Now i is: " + i);
//        } while (i < 10);

//        int i;
//        for (i = 0; i < 10; i++) {
//            System.out.println("Im in the loop before I increments. I is : " + i);
//
//
//        }
//        System.out.println("this is out of the loop, note i is incremented once more. I is now: " + i);


        //string comparison. dont use ==
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();

        boolean confirmation = userInput.equals("y");



    }
        //for loops dont let u choose what to do before vs after incrementing

}
