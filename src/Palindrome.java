import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        // prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // the index of the first character in the string
        int low = 0;

        // the index of the last character in the string
        int high = s.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }

            low++;
            high--;
        }

        if (isPalindrome)
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}
