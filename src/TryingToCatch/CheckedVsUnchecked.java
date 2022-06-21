package TryingToCatch;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class CheckedVsUnchecked {


    public static void main(String[] args) throws FileNotFoundException{


        //call the readFile method and pass in the filename
        readFile("myFile.txt");
        //...but now have error here^ bc nothing catching the method still
        // so pass the throws declaration to main but not a true fix.
        //just wrap readFile with a try catch!
    }


    private static void readFile(String fileName) throws FileNotFoundException {
//                                          //...and this:^
//        try {
//
//            FileReader reader = new FileReader(fileName); //pass in the name of file to be opened
//
//        } catch (FileNotFoundException fnfe) {
//
//            System.out.println("File doesn't exist");
//        }

        //...or just do this:
        FileReader reader = new FileReader(fileName);
    }
}
