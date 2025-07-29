//ArrayIndexOutOfBoundsException

package ExceptionHandling;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println("Element: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Index Number is Beyond the length of the array , So which is not possible to print ");
        }finally{
            System.out.println("Code Executed Successfully");

        }
    }
}
