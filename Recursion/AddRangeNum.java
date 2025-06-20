package Recursion;

public class AddRangeNum {
    public static void main(String[] args) {
        System.out.println(add(10,20));
    }
    public static int add(int start , int end){
        if(start<end)  
            return end + add(start , end-1);
        else
            return 0;
    }
}
