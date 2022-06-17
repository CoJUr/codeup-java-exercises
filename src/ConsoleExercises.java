import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;

//        System.out.printf("The value of pi is approximately %.2f%n", pi);
//
        Scanner scanner = new Scanner(System.in);

//        System.out.println("enter an integer : ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered " + userInput);
//        System.out.printf("You entered %d%n", userInput);


//        String first;
//        String second;
//        String third;
//        System.out.println("enter 3 words");
//        first = scanner.next();
//        System.out.printf("%s%n", first);
//        System.out.println("First word is: " + first);
////        System.out.println("Please enter next word");
//        second = scanner.next();
//        System.out.println("Second word is: " + second);
//        third = scanner.next();
//        System.out.println("third word is: " + third);


        //walkthru
        System.out.println("enter 3 words: " );
        for (int i = 0; i < 3; i++) {
            String userInput = scanner.next();
            System.out.printf("%s%n", userInput);
        }

        String sentence;
        System.out.println("Please enter a sentence");
        sentence = scanner.nextLine();
        System.out.println("you entered : " + sentence);




        //calculate the permimeter and area of classroom
        int length;
        int width;
        System.out.println("Please enter the length");
        length = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter the width ");
        width = Integer.parseInt(scanner.nextLine());

        //int perimeter = (Integer.parseInt(Width) + Integer.parseInt(length)) * 2
            // souf ("the perimeter of your classroom is %d%n", perimeter)

        System.out.println(width * length + " is the area and " + (length + length + width + width)
        + " is the perimeter");

    }
}
