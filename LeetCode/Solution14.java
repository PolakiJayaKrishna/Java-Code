package LeetCode;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
        sc.close();
    }
    public static String longestCommonPrefix(String[] strs){
        if(strs.length == 0 || strs == null){
            return "";
        }
        String first = strs[0];
        StringBuilder result = new StringBuilder();

        for(int i=0;i<first.length();i++){
            char c = first.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i) !=c){
                    return result.toString();
                }
            }
            result.append(c);
        }   
        return result.toString();
    }
}
