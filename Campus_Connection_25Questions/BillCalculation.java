//Bill Calculation...
import java.util.Scanner;
public class BillCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No.of Units Consumed: ");
        int units = sc.nextInt();
        double bill=0;
        if(units<0)
            System.out.print("Invalid Input..!" + "\n" + "Try Again...");
        else {
            if(units<100){
                bill = units*1;
            }
            else if(units < 200){
                bill = (100*1) + ((units-100) * 1.5);
            }
            else if (units  <300){
                bill = (100*1) + (100*1.5) + ((units-200 ) * 2);
            }
            else {
                bill = (100*1) + (100*1.5) + (100*2) + ((units-300) * 3);
            }
            System.out.print("Bill is: " + bill );
            sc.close();
        }
    }
}
