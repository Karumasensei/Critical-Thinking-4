import java.util.Scanner;  // Import the Scanner class for input

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read user input
        double[] grades = new double[10];  // Array to store 10 grades
        double total = 0;  // Variable to store the sum of all grades
        double maxGrade = Double.MIN_VALUE;  // Variable to track the maximum grade (initially set to the smallest possible value)
        double minGrade = Double.MAX_VALUE;  // Variable to track the minimum grade (initially set to the largest possible value)
        
        // Loop to collect 10 grades from the user
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter grade " + (i + 1) + ": ");  // Prompt the user for input
                try {
                    double grade = Double.parseDouble(scanner.nextLine());  // Read input and convert it to a double
                    if (grade >= 0 && grade <= 100) {  // Check if the grade is within the valid range (0 to 100)
                        grades[i] = grade;  // Store the valid grade in the array
                        total += grade;  // Add the grade to the total sum
                        if (grade > maxGrade) maxGrade = grade;  // Update maxGrade if the current grade is higher
                        if (grade < minGrade) minGrade = grade;  // Update minGrade if the current grade is lower
                        break;  // Exit the while loop once a valid grade is entered
                    } else {
                        System.out.println("Please enter a valid grade between 0 and 100.");  // Invalid grade message
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numeric value.");  // Catch input errors and prompt again
                }
            }
        }

        // Calculate average
        double average = total / 10;  // Calculate the average by dividing the total sum by 10

        // Display the results
        System.out.println("\nClass Statistics:");
        System.out.printf("Average grade: %.2f%n", average);  // Print the average with two decimal places
        System.out.println("Maximum grade: " + maxGrade);  // Print the maximum grade
        System.out.println("Minimum grade: " + minGrade);  // Print the minimum grade
        
        scanner.close();  // Close the scanner to free resources
    }
}
