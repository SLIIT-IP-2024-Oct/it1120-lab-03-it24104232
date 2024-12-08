import java.util.Scanner;

public class IT24104232Lab3Q4 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a five-digit number
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
        } else {
            // Separate the number into individual digits
            int thousands = number / 10000;         // Extract the first digit (ten-thousands place)
            int hundreds = (number / 1000) % 10;    // Extract the second digit (thousands place)
            int tens = (number / 100) % 10;         // Extract the third digit (hundreds place)
            int ones = (number / 10) % 10;          // Extract the fourth digit (tens place)
            int onesPlace = number % 10;            // Extract the fifth digit (ones place)
            
            // Print the digits separated by a space
            System.out.println(thousands + " " + hundreds + " " + tens + " " + ones + " " + onesPlace);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
