package JogoDaMoeda.Pessoa;
public class Main {
    public static void main(String[] rgs) {
        
        Jogo jogo = new Jogo(3, 0, 0, 5, 0, 1, false);

        for (int i = 0; i < 100; i++){
          System.out.print(i+1 + "º Rodada: ");;
          jogo.round();
          System.out.println();
          
        }
        
    }
    
}
