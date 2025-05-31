import java.util.Scanner;

class TimeBasedGreeting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Time: ");
        int Time = sc.nextInt();
        if(Time >=00 && Time <=12){
            System.out.print("Good Morning..");
        } else if (Time >12 && Time <=18) {
            System.out.print("Good Afternoon..");
        } else if (Time >19 && Time <=23) {
            System.out.print("Good Evening..");
        }else{
            System.out.print("Invalid input..!");
        }
    } 
}