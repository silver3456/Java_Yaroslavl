package _26_08.Assignment_4;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        double a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a");
        a = sc.nextDouble();

        System.out.println("Input b");
        b = sc.nextDouble();

        System.out.println("Input c");
        c = sc.nextDouble();

        System.out.println(a + "X^2 + " + b + "X + " + c + " = 0");

        double disc = b * b - 4 * a * c;

        if (disc < 0) {
            System.out.println("Doesn't have a root");
        } else if (disc == 0) {
            double root = calcValue(a, b, disc, true);
            System.out.println("Root is " + root);
        } else {
            double root1 = calcValue(a, b, disc, false);
            double root2 = calcValue(a, b, disc, true);

            System.out.println("Root 1 = " + root1 + ", Root 2 = " + root2);
        }

    }

    public static double calcValue(double a, double b, double disc,
                                   boolean isPlus) {
        int coef = 1;
        if (!isPlus) {
            coef = -1;
        }
        return (-b + coef * Math.sqrt(disc)) / (2 * a);
    }
}
