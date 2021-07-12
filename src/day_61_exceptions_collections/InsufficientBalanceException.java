package day_61_exceptions_collections;

/**
 * custom exception type
 * that extends
 */
public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
