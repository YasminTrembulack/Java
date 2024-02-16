
package Prova.Questao6;

public class IntersectionSet extends Set
{   
    IntersectionSet(){}
    
    private Set a;
    private Set b;
    
    @Override
    public boolean contains(Float number){
       
        if (a.contains(number) && b.contains(number)){
            return true;
        }
        return false;
        
    }
    
}