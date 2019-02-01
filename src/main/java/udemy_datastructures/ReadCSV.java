package udemy_datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {


    public static void main(String[] args) {
        //This method will read data from CSV file
        List<String[]> data = new ArrayList<>();

        String filename = "/Users/alexander/SDET_Files/accounts.csv";
        String dataRow;

        try {
            //Open the file
            BufferedReader br = new BufferedReader(new FileReader(filename));

            //Read data as long as it's not empty
            while ((dataRow = br.readLine()) != null) {
                //Parse the data by commas
                String[] line = dataRow.split(",");
                //Add the data to collection
                data.add(line);
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String[] account : data) {
            System.out.print("[ ");
            for (String field : account) {
                System.out.print(field + " ");
            }
            System.out.println(" ]");
        }
    }
}
