package banking_system.exceptions;

public class InsufficientFoundsException extends RuntimeException {
    public InsufficientFoundsException(String message) {
        super(message);
    }
}
