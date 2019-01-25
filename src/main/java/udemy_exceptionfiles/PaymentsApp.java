package udemy_exceptionfiles;

import java.util.Scanner;

public class PaymentsApp {

    //Take amount from a user
    public static void main(String[] args) {
        double payment = 0;
        boolean positivePymt = true;


        do {
            //1.Ask the user for input
            System.out.println("Enter the payment amount: ");

            //2.Get the amount and test the value
            Scanner sc = new Scanner(System.in);

            //3.Handle exceptions

            try {
                payment = sc.nextDouble();
                if (payment <= 0) {
                    throw new NegativePaymentException(payment);
                }else {
                    positivePymt = true;
                }
            } catch (NegativePaymentException e) {
                System.out.println(e.toString());
                System.out.println("Please try again");
                positivePymt = false;
            }

        } while (!positivePymt);


        //4.Print confirmation

        System.out.println("Thank you for your payment: $" + payment);
    }
}




