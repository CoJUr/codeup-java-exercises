package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class KOCoding {

    public static void main(String[] args) {


    try{
//        BufferedWriter bw = new BufferedWriter(
//                new FileWriter("./data/data.txt"));//write the path of where the file should go in the parens
//        bw.write("Karen\n");
//        bw.write("Chad\n");
//        bw.write("Becky\n");
//        bw.close();

        //buffered writer instead of reader to READ FROM
        BufferedReader br = new BufferedReader(
                new FileReader("./  data/data.txt")); // path in the parens same as before

        String s;
        //using the br, loop thru each line to print out
        while ((s = br.readLine()) != null ) { //it will == null when last line of file reached
            System.out.println(s);
            //data.txt read to the console
        }
        br.close();
    } catch(Exception ex) {
        ex.printStackTrace();
        return; // return early if exception is thrown
    }
}
}

