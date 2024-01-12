package EnumEStatic.Robot;

public class ExRobot {
    
    private State state;
    private Integer x = 0;
    private Integer y = 0;


    public ExRobot(){
        this.state = State.OFF;
        this.x = 0;
        this.y = 0;
    }

    public void setState(State value){
        this.state = value;
    }

    public void move(State dir){
        if(this.state.equals(State.ON)){
            if(dir.equals(Direction.DIREITA)){
                this.x++;
            }
            else if (dir.equals(Direction.ESQUERDA)) {
                this.x--;
            }
            else if (dir.equals(Direction.CIMA)) {
                this.y++;
            }
            else if (dir.equals(Direction.BAIXO)) {
                this.y--;
            }
        }
    //     if (this.state.equals(State.OFF))
    //   return;

    //     switch (dir) {
    //     case LEFT:
    //         x--;
    //         break;
    //     case RIGHT:
    //         x++;
    //         break;
    //     case TOP:
    //         y++;
    //         break;
    //     case DOWN:
    //         y--;
    //         break;
    }

    public void jump(State dir){
        move(dir);
        move(dir);
    }

    @Override
    public String toString(){
        return "(x " + x.toString() + " y " + y.toString() +")";
    }

}   

