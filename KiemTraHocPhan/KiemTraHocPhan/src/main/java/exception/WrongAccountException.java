package exception;

public class WrongAccountException extends RuntimeException{
    public WrongAccountException(String message) {
        super(message);
    }
}
