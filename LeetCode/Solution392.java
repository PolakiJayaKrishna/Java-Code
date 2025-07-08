package LeetCode;
public class Solution392{
    public static void main(String[] args) {
        String str1 = "abd";
        String str2 = "azbycxdo";
        isSubSequence(str1 , str2);
    }
    public static void isSubSequence(String s , String t){
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        System.out.println("String 1 is subsequence of String 2: " + (i == s.length()));
    }
}