//Create a list of city names. Some names appear more than once.
//Print only the unique city names using a HashSet.


package DSA.HashSet;

import java.util.HashSet;
import java.util.Set;

public class UniqueCities {
    public static void main(String[] args) {
        String[] strarr = {"Chennai", "Delhi", "Mumbai", "Chennai", "Mumbai"};
        Set<String> uniqueCities = new HashSet<>();
        for (String cites : strarr) {
            uniqueCities.add(cites);
        }
        System.out.println("Unique Cites: ");
        for (String cites : uniqueCities) {
            System.out.println(cites);
        }
    }
}
