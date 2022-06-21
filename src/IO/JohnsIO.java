package IO;

import java.io.*;

public class JohnsIO {

    public static void main(String[] args) {

        //loop thru strings to write elements to the file
        String[] names = {"John", "Carl", "Jerry"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./data/output.txt"));
            writer.write("Writing to a file");
            writer.write("\nWriting another line!");

            for(String name: names) {
                writer.write("\n" + name);
            }
            writer.close(); //if forget to do this, file will be created but forever blank

        } catch (IOException e) {
//          default:  throw new RuntimeException(e);
            e.printStackTrace();
        }

        //above: writing to file
        //Below: reading from file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./data/output.txt"));

            //read a line
//            System.out.println(reader.readLine());
            //^returns a string so might want to save to a variable. reads 1st line of file to console

            //read each line
            String line;
            while((line = reader.readLine()) != null) {
                //^reads a line of text and stores it in the var until it gets to a null line
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
