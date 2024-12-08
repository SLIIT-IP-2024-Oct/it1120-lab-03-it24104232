import java.util.Scanner;

public class IT24104232Lab3Q1A {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        // Ask for the number of kilograms to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();
        
        // Calculate the total amount to pay
        double totalAmount = pricePerKg * kilograms;
        
        // Output the result
        System.out.println("Total amount to pay: " + totalAmount);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
