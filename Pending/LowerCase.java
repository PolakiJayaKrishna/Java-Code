package Pending;
import java.util.Scanner;
public class LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: "); // Added a prompt for the user
        String str = sc.nextLine();
        int temp = 0;
        String s = ""; // Initialize s to an empty string

        // Loop through each character in the string
        for(int i = 0; i < str.length(); i++){ // Loop up to str.length() - 1 to include the last character
            temp = str.charAt(i); // temp now holds the ASCII value of the character

            if(temp >= 65 && temp <= 90){ // Check if it's an uppercase letter
                temp += 32; // Convert to lowercase ASCII value
            }

            // Convert the integer ASCII value back to a char, then append to the string 's'
            s = s + (char)temp; // Correct way to convert int (ASCII) to char and append to String
        }
        System.out.println("Modified string: " + s); // Print the result
        sc.close(); // Close the scanner
    }
}