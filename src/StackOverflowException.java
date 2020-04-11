
public class StackOverflowException extends RuntimeException {
    public StackOverflowException() {
        super("Stack Overflow Exception");
    }
    
    public StackOverflowException(String mensaje) {
        super(mensaje);
    }
    

}