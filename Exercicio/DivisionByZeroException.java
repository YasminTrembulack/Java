package Exception.Exercicio;
import java.lang.Exception;

public class DivisionByZeroException extends Exception{
    public DivisionByZeroException(){
        super("Division by zero...");
    }
}
