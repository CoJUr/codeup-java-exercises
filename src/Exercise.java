import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s%n", name);
        System.out.println("Hello, " + name);

    }

}
