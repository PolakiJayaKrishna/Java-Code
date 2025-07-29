//Division by Zero

package ExceptionHandling;

public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("We Can't divide a Number with Zero");
        } finally {
            System.out.println("Code Executed Successfully");

        }

    }
}
