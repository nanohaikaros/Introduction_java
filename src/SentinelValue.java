import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        // read an initial data
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        // keep reading data until the input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;

            // read the next data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
