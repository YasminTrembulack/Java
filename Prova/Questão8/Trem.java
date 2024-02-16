package Prova.Questão8;

public class Trem {

    private Vagao head;
    private int length;

    public Trem(){
        this.length = 1;
        this.head = new Vagao(Content.MAQUINISTA);
    }

    public void add(Content value){
        if (value.equals(Content.MAQUINISTA)){
            System.out.println("O trem só pode ter uma maquinista.");
            return;
        }
        Vagao current = head;
        while(current.getNext()!= null)
        {
            current = current.getNext();
        }
        current.setNext(new Vagao(value));
        length++;
    }

    public int count(Content value){
        int reault = 0;
        Vagao temp = head;
        for( int i = 0; i < this.length; i++){
          if (temp.getContent().equals(value)) {
            reault++;
          }
          temp = temp.getNext();
        }
        return reault;
    }
}
  
