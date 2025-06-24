//Convert a primitive double to a Double object, then unbox it.

package WrapperClass;
public class DoubleWrapperConversion{
    public static void main(String[] args) {
    double num = 45.67;
    Double obj = Double.valueOf(num);               //Boxing
    System.out.println("Primitive Number: " + num);
    System.out.println("Object: " + obj);
    double num1 = obj.doubleValue();                //Unboxing
    System.out.println("After Unboxing: " + num1);
    }
}