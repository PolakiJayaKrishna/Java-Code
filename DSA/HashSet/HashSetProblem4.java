//🔹 Task: Find duplicate characters in a string using HashSet.
package DSA.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class HashSetProblem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        str = str.trim();
        Set<Character> seen = new HashSet<>();
        HashSet<Character> duplicate = new HashSet<>(); 
        for (char s : str.toCharArray()) {
            if(!seen.add(s))
                duplicate.add(s);
        }
        System.out.println("Duplicates are: ");
        for (Character c : duplicate) {
            System.out.println(c);
        }
        sc.close();
    }
}
