package Recurrsion;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(factorialOf(number));
    }
    public static int factorialOf(int n){
        if(n < 1){
            return 1;
        }
        int factorial = n * factorialOf(n-1);
        return factorial;
    }
}
