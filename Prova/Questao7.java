package Prova;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        float red = 0f;
        float blue = 0f;
        
            try {
                int qtd = myObj.nextInt();
        
                for(int i = 0; i < qtd; i++){
                    float number = Sortear();
                    if(number < 1){
                        red++;
                    }
                    else{
                        blue++;
                    }
                    
                }
            
                float result = (4 * red) / (red+blue);
                System.out.println("PI:  " + result);

            } catch (NumberFormatException e) {
                System.out.println("Convert a string to one of the numeric types");
            }catch(InputMismatchException e){
                System.out.println("The token retrieved does not match the pattern for the expected type.");
            }
            finally{
                myObj.close();
            }
    }

    static float Sortear(){
        Random rand = new Random();

        float x = rand.nextFloat();
        float y = rand.nextFloat();

        float number = (float) Math.sqrt(((x*x) + (y*y)));
        return number;
    }
}


