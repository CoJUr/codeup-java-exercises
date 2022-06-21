package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class KOCoding {

    public static void main(String[] args) {


    try{
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("./data/data.txt"));//write the path of where the file should go in the parens
        bw.write("Karen\n");
        bw.write("Chad\n");
        bw.write("Becky\n");
        bw.close();
    } catch(Exception ex) {
        ex.printStackTrace();
        return; // return early if exception is thrown
    }
}
}

