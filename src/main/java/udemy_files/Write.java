package udemy_files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {

        //1.Define the path that I want to write
        String filename = "/Users/alexander/SDET_Files/FileToWrite.txt";
        String message = "I am writing data that would be place to a file";


        //2.Create the file in Java
        File file = new File(filename);

        try {
            //3.Open the file
            FileWriter fw = new FileWriter(file);

            //4.Write to the file
            fw.write(message);

            //5.Close the resources
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR: Could not read the file: " + filename);
            e.printStackTrace();
        }finally {
            System.out.println("Closing the filewriter");
        }

    }
}
