package Recursion;

public class Increasingorder {
    public static void main(String[] args) {
        int upto = 15;
        call(upto , 1);
    }
    public static void call(int upto , int num){
        if(upto < num)  return;
        System.out.print(num + " ");
        num++;
        call(upto , num);
    }
}
