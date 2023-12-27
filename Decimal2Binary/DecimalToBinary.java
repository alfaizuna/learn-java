package Decimal2Binary;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to binary
        String binaryResult = decimalToBinary(decimalNumber);

        // Output: Binary representation
        System.out.println("Binary representation: " + binaryResult);

        scanner.close();
    }

    // Function to convert decimal to binary
    private static String decimalToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();

        // Handle the case when the input is 0 separately
        if (decimalNumber == 0) {
            return "0";
        }

        // Convert decimal to binary
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder); // Insert the remainder at the beginning of the string
            decimalNumber /= 2;
        }

        return binary.toString();
    }
}

