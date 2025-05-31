import java.util.Scanner;

class DivisibilityCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        if(Number%3==0 && (Number%5)==0){
            System.out.print(Number + " is Divisible by 3 and 5");
        }else{
            System.out.println(Number +" is not Divisible by 3 and 5");
        }
    }
}