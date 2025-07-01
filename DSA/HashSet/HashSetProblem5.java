// Task: Count the number of unique words in a sentence.


package DSA.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetProblem5 {
    public static void main(String[] args) {
        String input = "This is Java and Java is fun";
        
        Set<String> set  = new HashSet<>();
        for (String s : input.toLowerCase().trim().split(" ")) {
            set.add(s);
        }
        System.out.println("Number of Unique Words are: "+set.size());
    }
}
