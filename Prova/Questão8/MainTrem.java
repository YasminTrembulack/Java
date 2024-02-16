package Prova.Questão8;

public class MainTrem {
    public static void main(String[] args) {
        Trem trem = new Trem();

        trem.add(Content.PASSAGEIROS);
        trem.add(Content.PASSAGEIROS);
        trem.add(Content.PASSAGEIROS);
        trem.add(Content.PASSAGEIROS);

        trem.add(Content.COMBUSTÍVEL);
        trem.add(Content.COMBUSTÍVEL);

        trem.add(Content.VAZIO);

        trem.add(Content.ANIMAIS);

        System.out.println("O trem possuí "+trem.count(Content.PASSAGEIROS)+" vagao desse tipo.");


    }
}
