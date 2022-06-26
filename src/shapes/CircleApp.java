package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        double userInput;

        while (true) {
            Input input = new Input();
//            System.out.println("Please enter the circle's radius as a Double");
            userInput = input.getDouble();
//        System.out.println("you entered " + userInput);

            Circle userCircle = new Circle(userInput);

            System.out.printf("Congrats, you made a circle! Its circumference = %.3f \nand it has an area of: %.3f",
                    userCircle.getCircumference(), userCircle.getArea());
            System.out.println("\nWould you like to continue?");
            boolean response = new Input().yesNo();
            if (!response) {
                System.out.println("You created : "+ Circle.getTotalCircles() + " total circles");
                break;
            }
        }
    }






}
