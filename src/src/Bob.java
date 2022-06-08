import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ask bob a question");
        String query = sc.nextLine();

        if (query.endsWith("?")) {
            System.out.println("Sure.");
        }

        System.out.println("Give bob an excited statement!");
        String excited = sc.nextLine();
        if (excited.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if (!excited.endsWith("!")) {
            System.out.println("Whatever");
        }

        System.out.println("Anything else you'd like to say to Bob?");
        String empty = sc.nextLine();
        if (empty.equals("")){
            System.out.println("Fine. Be that way!");
        } else if (!empty.equals("")) {
            System.out.println("whatever");
        }




    }
}
