import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // create a scanner object
        Scanner input = new Scanner(System.in);

        // prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // compute area
        double area = radius * radius * 3.14159;

        // display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
