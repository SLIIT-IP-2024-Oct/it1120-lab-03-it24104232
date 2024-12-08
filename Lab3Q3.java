import java.util.Scanner;

public class IT24104232Lab3Q3 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the amount
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();
        
        // Array of available denominations
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        // Loop through each denomination and calculate the number of notes/coins
        for (int denomination : denominations) {
            // Calculate how many notes/coins of the current denomination
            int count = amount / denomination;
            
            // Print the result for this denomination
            System.out.println(denomination + " Notes – " + count);
            
            // Subtract the equivalent amount from the total amount
            amount = amount % denomination;
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
