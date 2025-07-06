package LeetCode;

import java.util.Scanner;

public class Solution1768{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter a String2: ");
        String str2 = sc.nextLine();
        merge(str1,str2);
        sc.close();

    }
    public static void merge(String str1 ,String str2){
        StringBuilder sb = new StringBuilder();
        int len1 = str1.length();
        int len2 = str2.length();
        int largeNum = Math.max(len1,len2);
        for (int i = 0; i < largeNum; i++) {
            if(i<len1) sb.append(str1.charAt(i));
            if(i<len2) sb.append(str2.charAt(i));
        }
        System.out.print(sb.toString());
    }
}