import java.util.Scanner;

public class LearnJava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = scan.nextInt();

        System.out.println("Enter your ice cream");

        String flavor = scan.next();

        System.out.println(age + " " + flavor);
    }
}
