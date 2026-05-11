package practice12.Task2;

// непроверяемое исключение -> RuntimeException
public class InvalidUserException extends RuntimeException {
    public InvalidUserException(String message) {
        super(message);
    }
}
