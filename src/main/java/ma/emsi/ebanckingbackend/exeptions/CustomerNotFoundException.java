package ma.emsi.ebanckingbackend.exeptions;

public class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException(String message ) {
        super(message);
    }
}
