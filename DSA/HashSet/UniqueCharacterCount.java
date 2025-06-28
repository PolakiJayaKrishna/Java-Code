//Given a string, count how many unique characters are present in it using a HashSet.


package DSA.HashSet;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterCount {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        String word = "programming";
        for (char Char : word.toCharArray()) {
            unique.add(Char);
        }
        for (Character character : unique) {
            System.out.print(character + " ");
        }
    }
}
