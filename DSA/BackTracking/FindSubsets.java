//Given a string, write a program to find and print all possible subsets (combinations, not necessarily contiguous) of the characters in that string using backtracking. For example, for the string "abc", the output should include a, b, c, ab, ac, bc, and abc.

package DSA.BackTracking;

public class FindSubsets {
    // Formula For subset is 2^n
    public static void main(String[] args) {
        String string = "abc";
        recursion(string, "", 0);// Call
    }

    public static void recursion(String str, String ans, int i) { // Recursion Method
        // BaseCase
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
                return;
            } else {
                System.out.println(ans);
                return;
            }
        }

        // Recursion
        // We Have to Two Options for every character Here "YES" OR "No"
        // For YES add it to the substring and increment i
        recursion(str, ans + str.charAt(i), i + 1);
        // For No  leave string as it is and increment i
        recursion(str, ans, i + 1);
    }
}
