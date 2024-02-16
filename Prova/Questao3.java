package Prova;

public class Questao3 {
    public static void main(String[] args) {
        int number = 3;
        
        System.out.println(VerificarPar(number));
    }

    static boolean VerificarPar(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
}
