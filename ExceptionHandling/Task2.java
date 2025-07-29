//NullPointerException

package ExceptionHandling;

public class Task2 {
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println("Length: " + name.length());
        } catch (NullPointerException e) {
            System.out.println("name is Null");
        } finally {
            System.out.println("Code Executed Successfully");

        }
    }
}
