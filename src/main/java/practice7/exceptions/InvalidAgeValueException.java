package practice7.exceptions;

// проверяемое исключение -> Exception
public class InvalidAgeValueException extends Exception {
    public InvalidAgeValueException(String message) {
        super(message);
    }
}
