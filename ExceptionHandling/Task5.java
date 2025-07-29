package ExceptionHandling;

public class Task5 {
    public static void checkAge(int age) throws InvaildAgeException {
        if (age < 18)
            throw new InvaildAgeException("You must be at least 18 years old.");
        else
            System.out.println("Access granted.");
    }

    public static void main(String[] args) {

        try {

            checkAge(15);

        } catch (InvaildAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Validation finished.");
        }

    }
}

class InvaildAgeException extends Exception {
    InvaildAgeException(String message) {
        super(message);
    }
}
