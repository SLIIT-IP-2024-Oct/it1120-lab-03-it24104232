import java.util.Scanner;

public class IT24104232Lab3Q2 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();
        
        // Ask for the number of OT hours worked
        System.out.print("Enter the number of OT hours worked: ");
        double otHours = scanner.nextDouble();
        
        // Ask for the OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();
        
        // Calculate the OT amount
        double otAmount = otHours * otHourlyRate;
        
        // Calculate the total salary (monthly salary + OT amount)
        double totalSalary = monthlySalary + otAmount;
        
        // Output the result
        System.out.println("OT Amount: " + otAmount);
        System.out.println("Total Salary (including OT): " + totalSalary);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
