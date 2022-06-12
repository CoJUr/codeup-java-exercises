package util;

import java.util.Scanner;

public class Input {

    //variables---
    private Scanner scanner;


    //----


    //methods---

    public Input () {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        return scanner.nextLine().equalsIgnoreCase("yes") || scanner.nextLine().equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
//        if (scanner.nextInt())

        return scanner.nextInt();
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        return scanner.nextInt();
    }

    public double getDouble() {
        return scanner.nextInt();
    }


}
