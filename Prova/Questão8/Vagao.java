package Prova.Questão8;

public class Vagao {

    private Vagao next;
    private Content content; 

    Vagao(Content value)
    {
        this.content = value;
    }

    public void setNext(Vagao nextNode) 
    {
        this.next = nextNode;
    } 

    public void setNext(Content value)
    {
        this.content = value;
    }

    public Vagao getNext()
    {
        return next;
    }

    public Content getContent()
    {
        return this.content;
    }
}

