//Given a string, write a program to generate and print all possible permutations of its characters using recursion and backtracking.

package DSA.BackTracking;

public class FindPermutations {
    public static void main(String[] args) {
        String str = "abc";
        recursion(str, "");
    }
    public static void recursion(String str , String ans){
        //base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //example : string is abcd -> if c pick a then newString becomes => ab+d = abd
            String newString = str.substring(0,i) + str.substring(i+1);
            recursion(newString, ans+ch);
        }
    }
}
