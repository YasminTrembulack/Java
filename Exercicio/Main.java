package Exception.Exercicio;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Integer option = 3;
        switch (option) {
            case 1:
                try {
                    calculator.QuadraticFunction(4.0, 10.0, 6.0);
                } 
                catch (DeltaZeroException e) 
                {
                    System.out.println("Delta negative...");
                    e.printStackTrace();
                } 
                catch (DivisionByZeroException e) 
                {
                    System.out.println("Division by zero... A equals zero.");
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    calculator.LinearSystem(2.0, 2.0, 4.0);
                } 
                catch (DivisionByZeroException e) 
                {
                    System.out.println("Division by zero... A equals zero.");
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    calculator.System2x2(1.0, 1.0, 4.0, 1.0, 1.0, 2.0);
                } 
                catch (DivisionByZeroException e) 
                {
                    System.out.println("Division by zero... A equals zero.");
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }
}

    

