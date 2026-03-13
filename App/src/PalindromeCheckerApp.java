import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String text = sc.nextLine();

        String reversed = "";

        // Reverse the string
        for(int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        boolean isPalindrome = text.equalsIgnoreCase(reversed);

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}
