package day_61_exceptions_collections;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException() {
    }

    public BreakTimeException(String message) {
        super(message);       //call parent class constructor
    }
}
