import java.util.Scanner;

class ProductSignCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int Number1 = sc.nextInt();
        int Number2 = sc.nextInt();
        int Number3 = sc.nextInt();
        sc.close();
        int Product = Number1*Number3*Number2;
        if(Product>0){
            System.out.print("Product of " +Number1 +","+Number2 +","+Number3 +" = "+Product + " is Positive...");
        }else if(Product<0){
            System.out.print("Product of " +Number1 +","+Number2 +","+Number3 +" = "+Product + " is Negative..");
        }else{
            System.out.print("Product of " +Number1 +","+Number2 +","+Number3 +" = "+Product +" is Zero...");
        }
    }
}