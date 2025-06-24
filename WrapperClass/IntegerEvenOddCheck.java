 //2. Check if an Integer object is even or odd using .intValue()

package WrapperClass;

public class IntegerEvenOddCheck {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(11);
        int num = obj.intValue();
        if(num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }
}
