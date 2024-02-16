package EnumEStatic;



//ENUM "por baixo dos panos"



public final class Mode { // final significa que não é possivel herdar essa classe
    private boolean write;
    private boolean read;
    
    Mode(boolean cwrite, boolean cread) {
        write = cwrite;
        read = cread;
    }

    //Mode() {} // não pode criar uma instancia de objetos fora da classe
    // pq o construtor é privado.

    public final static  Mode READ = new Mode(false, true);
    public final static  Mode WRITE = new Mode(true, false);
    public final static  Mode READWRITE = new Mode(true, true);
    public final static Mode APPEND = new Mode(true, false);
    
    public boolean canWrite(){
        return this.write;
    }

    public boolean canRead(){
        return this.read;
    }

}
