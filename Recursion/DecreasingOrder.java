package Recursion;

public class DecreasingOrder {
    public static void main(String[] args) {
        int number = 10;
        call(number);
    }
    public static void  call(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        call(n-1);
    }
}
