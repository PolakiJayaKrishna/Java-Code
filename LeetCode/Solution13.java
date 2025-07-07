package LeetCode;

import java.util.Scanner;
import java.util.HashMap;

public class Solution13 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> hp = new HashMap<>();
        hp.put('I', 1);
        hp.put('V', 5);
        hp.put('X', 10);
        hp.put('L', 50);
        hp.put('C', 100);
        hp.put('D', 500);
        hp.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = hp.get(s.charAt(i));
            if (i + 1 < s.length() && c < hp.get(s.charAt(i + 1)))
                result -= c;
            else 
                result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman Letter: ");
        String string = sc.nextLine();
        string = string.trim();
        sc.close();
        System.out.println(romanToInt(string));
    }
}
