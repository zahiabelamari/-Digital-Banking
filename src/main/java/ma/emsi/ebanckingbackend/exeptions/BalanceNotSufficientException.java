package ma.emsi.ebanckingbackend.exeptions;


public class BalanceNotSufficientException extends Exception {
    public BalanceNotSufficientException(String message) {
        super(message);
    }
}