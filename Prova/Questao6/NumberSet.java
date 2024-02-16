package Prova.Questao6;

import java.util.HashSet;

public class NumberSet extends Set
{
    private HashSet<Float> hashset;
    
    public NumberSet(){}

    @Override
    public boolean contains(Float number){
        return hashset.contains(number);
    }

}
