package practice7.exceptions;

// непроверяемое исключение -> RuntimeException
public class NotTheAppropriateValueException extends RuntimeException {
    public NotTheAppropriateValueException(String message) {
        super(message);
    }
}
