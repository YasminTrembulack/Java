package EnumEStatic;
public enum FileMode {
    WRITE(true, false),
    READ(false, true),
    READWRITE(true, true),
    APPEND(true, false);

    private boolean write;
    private boolean read;

    FileMode(boolean cwrite, boolean cread) {
        this.write = cwrite;
        this.read = cread;
    }

    public boolean canWrite() {
        return this.write;
    }
    
    public boolean canRead() {
        return this.read;
    }
        
}
