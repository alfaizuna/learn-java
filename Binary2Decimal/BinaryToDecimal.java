package Binary2Decimal;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();

        // Check if the input is a valid binary number
        if (isValidBinary(binaryNumber)) {
            int decimalValue = binaryToDecimal(binaryNumber);
            System.out.println("Decimal equivalent: " + decimalValue);
        } else {
            System.out.println("Invalid binary number. Please enter a valid binary number.");
        }

        scanner.close();
    }

    // Method to check if the input is a valid binary number
    private static boolean isValidBinary(String binaryNumber) {
        return binaryNumber.matches("[01]+");
    }

    // Method to convert binary to decimal
    private static int binaryToDecimal(String binaryNumber) {
        int decimalValue = 0;
        int binaryLength = binaryNumber.length();

        for (int i = 0; i < binaryLength; i++) {
            int digit = Character.getNumericValue(binaryNumber.charAt(i));
            int power = binaryLength - 1 - i;
            decimalValue += digit * Math.pow(2, power);
        }

        return decimalValue;
    }
}
