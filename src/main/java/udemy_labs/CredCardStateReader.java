package udemy_labs;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CredCardStateReader {
    public static void main(String[] args) {
        //This method will read data from CSV file
        List<String[]> transactions = new ArrayList<>();

        String filename = "/Users/alexander/SDET_Files/CCStatement.csv";
        String dataRow;
        double balance = 0;

        try {
            //Open the file
            BufferedReader br = new BufferedReader(new FileReader(filename));

            //Read data as long as it's not empty
            while ((dataRow = br.readLine()) != null) {
                //Parse the data by commas
                String[] line = dataRow.split(",");
                //Add the data to collection
                transactions.add(line);
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String[] transaction : transactions) {
            String date = transaction[0];
            String type = transaction[1];
            String vendor = transaction[2];
            double amount = Double.parseDouble(transaction[3]);
            System.out.println(date + " " + type + " " + vendor + " " + amount);


            if (type.equalsIgnoreCase("credit")) {
                //System.out.println("Add to balance");
                balance = balance + amount;
            } else if (type.equalsIgnoreCase("debit")) {
                // System.out.println("Subtract from balance");
                balance = balance - amount;
            } else {
                // System.out.println("Some other transaction");
            }
        }
        System.out.println("NEW BALANCE: " + balance);

    }
}
