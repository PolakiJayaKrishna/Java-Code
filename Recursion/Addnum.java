package Recursion;
public class Addnum{
    public static void main(String[] args) {
        int N = 10;
        System.out.println(add(N));
    }
    public static int add(int N){
        if(N>0)
            return N + add(N-1);
        else
            return 0;

    }
}