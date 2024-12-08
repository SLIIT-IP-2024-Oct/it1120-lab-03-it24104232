import java.util.Scanner;

public class IT24104232Lab3Q1B {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        // Ask for the number of kilograms to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();
        
        // Calculate the total amount before discount
        double totalAmount = pricePerKg * kilograms;
        
        // Calculate the discount (10% of the total amount)
        double discount = totalAmount * 0.10;
        
        // Calculate the total amount after the discount
        double totalAfterDiscount = totalAmount - discount;
        
        // Output the result
        System.out.println("Total amount before discount: " + totalAmount);
        System.out.println("Discount (10%): " + discount);
        System.out.println("Total amount to pay after discount: " + totalAfterDiscount);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
