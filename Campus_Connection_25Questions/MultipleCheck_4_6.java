import java.util.Scanner;

class MultipleCheck_4_6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        sc.close();
        if(Number%4==0 && (Number%6)==0){
            System.out.print(Number + " is Divisible by 4 and 6");
        }else{
            System.out.println(Number +" is not Divisible by 4 and 6");
        }
    }
}