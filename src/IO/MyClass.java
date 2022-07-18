package IO;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
//        File x = new File("./data/solo.txt");
////        create file obj from File
//
//        if (x.exists()) {
//            System.out.println(x.getName() + " does in fact exist");
//        } else {
//            System.out.println( x + " Does NOT exist.");
//        }
//
//
//
//        //read from the file with the Scanner
////        the file obj is input for the Scanner
//        try {
////            File x = new File("./data/solo.txt");
//            Scanner sc = new Scanner(x);
//            while(sc.hasNext()){
////                System.out.println(sc.next());
//                String a = sc.next();
//                String b = sc.next();
//                System.out.println(a + "" + b);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException("Error creating the file", e);
//        }
////        scanner inherits from Iterator ! so can use next()



//        formatter can create content and write it to the file
//        can then use the Formatter obj's format() to write content to it
        try {
            Formatter f = new Formatter("./data/solo.txt");
            f.format("Here is some content\n");
            f.format("%s %s %s", "1", "John", "Smith \n");
            f.format("%s %s %s", "2", "Amy", "Brown");
            f.close();

            File x = new File("./data/solo.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception e) {
            throw new RuntimeException("File not found or something? ", e);
        }
    }
}
