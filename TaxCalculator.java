package java;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        double taxAmount = calculateTax(income);

        System.out.println("Your tax amount is: $" + taxAmount);

        scanner.close();
    }

    private static double calculateTax(double income) {
        double taxRate = 0.15;
        return income * taxRate;
    }
}
