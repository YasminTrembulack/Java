package Exception.Exercicio;

import java.lang.Exception;
import java.lang.Math;

public class Calculator extends Exception{

    public Calculator(){}

    public void QuadraticFunction(double a, double b, double c) throws DeltaZeroException, DivisionByZeroException {
        
        double delta = (b * b) - (4 * (a * c));

        if (delta < 0) 
            throw new DeltaZeroException();
        if (a == 0)
            throw new DivisionByZeroException();
        
        double resultA = (-b + (Math.sqrt(delta))) / (2 * a);
        double resultB = (-b - (Math.sqrt(delta))) / (2 * a);

        System.out.print("Result(+): " + resultA + "  ");
        System.out.print("Result(-): " + resultB);
    }

    public void LinearSystem(double a, double b, double c) throws DivisionByZeroException{
        if (a == 0)
            throw new DivisionByZeroException();

        double result = (c - b) / a;
        System.out.println("Result: " + result);
    } 

    public void System2x2(double a, double b, double c, double d, double e, double f) throws DivisionByZeroException{
        if (((a * e) - (d * b)) == 0 || a == 0) 
            throw new DivisionByZeroException();

        double y = ((a * f) - (d * c)) / ((a * e) - (d * b));
        double x = (c - (b * y)) / a;
        System.out.println("Y: "+ y + " X: "+ x);
        
    }

}
