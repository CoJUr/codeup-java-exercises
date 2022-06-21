package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Copy {

    public static void main(String[] args) {

        //copying text from one file to a new file

        try{
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("./data/data-copy.txt"));
            BufferedReader br = new BufferedReader(
                    new FileReader("./data/data.txt")); // path in the parens same as before

            String s;
            //using the br, loop thru each line to print out
            while ((s = br.readLine()) != null ) { //it will == null when last line of file reached
                bw.write(s + "\n");
                //^instead of souting, write to the file
            }
            br.close();
            bw.close();
        } catch(Exception ex) {
            ex.printStackTrace();
            return; // return early if exception is thrown
        }
    }
}

