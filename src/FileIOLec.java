import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FileIOLec {

    public static void main(String[] args) {
        //path interface - defines an obj which reps a Path
        //Paths - contains static methods used to get file path
        //mainly an overloaded get method: .get(String filename)
        //.get(String directory, String filename)
        //.get(String parentDirectory, String ChildDirectory, String filename)
        //returns a Path object

        String directory = "data";
        String filename = "info.txt";

        //need to utilize a try catch bc : file path OR file itself may not exist or maybe encrypted)


        try {
            Path dataDirectory = Paths.get(directory); //getting filepath for directory
            Path dataFile = Paths.get(directory, filename); //saying this file will be within it

            //check to see if file exists (it doesnt yet)
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory); //will create the directory at this location (if doesnt exist)
            }

            if (!Files.exists(dataFile)) {
                //does info.txt exist within the directory?
                System.out.println("Your new file has been created ");
                Files.createFile(dataFile);
            }

            List<String> dataText = new ArrayList<>();
            //add data to it
            dataText.add("Athena");
            dataText.add("Medusa");
            dataText.add("Hades");
            dataText.add("Zues");
            dataText.add("Aphrodite");

            //write to the file with the list of greek gods
            if (Files.exists(dataFile)) {
                //Files.write(Path path, List<> data)
                Files.write(dataFile, dataText); //dataText needs to be something iterable like a list
                Files.write(dataFile, Arrays.asList("Apollo", "Gaia"), StandardOpenOption.APPEND);
                // appended the 2 names apollo and gaia to info.txt.    overwritten instead if no StandardOpenOption

                System.out.println(dataText); // dont have apollo or gaia here because different collection


            }

        } catch (IOException iox) {
            iox.printStackTrace();
        }


        /*outputting file data to console*/
        try {

            List<String> fileData = Files.readAllLines(Paths.get("data", "info.txt")); //converts contents of info.txt back into a list of strings
            System.out.println(fileData);

            //new list to dump appropriate data
            List<String> newList = new ArrayList<>();
            //iterate thru file data. if string equals Hades, replace with Deimos.
            for (String god : fileData) {
                if (god.equals("Hades")) {
//                    newList.add("Deimos"); //comment this out to effectively skip adding deimos
                    continue;
                }
                newList.add(god);
            }

            //over write file with updated contents
            Files.write(Paths.get("data", "info.txt"), newList);
            //after update, reassing to updated version
            fileData = Files.readAllLines(Paths.get("data", "info.txt"));
            //print out each line in the info.txt file
            for (String line : fileData) {
                System.out.println(line);
            }

        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }
}
