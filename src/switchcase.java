import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter job title (1-3):\n1. Manager\n2. Clerk\n3. Programmer\n");
        int jobTitle = input.nextInt();

        // Calculate hourly rate based on job title using switch statement
        double hourlyRate;
        switch (jobTitle) {
            case 1:
                hourlyRate = 30.0;
                break;
            case 2:
                hourlyRate = 20.0;
                break;
            case 3:
                hourlyRate = 25.0;
                break;
            default:
                System.out.println("Invalid job title");
                return;
        }

        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();

        // Calculate wage
        double wage = hourlyRate * hoursWorked;

        // Display result
        System.out.println("Weekly wage: $" + wage);
    }
}