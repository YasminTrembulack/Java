package EnumEStatic.Robot;


public class Robot {
    private State state;

    public Robot() {
        this.state = State.OFF;
    }

    public void setState(State value){
        this.state = value;
    }
    public void run(){
        if (this.state.equals(State.OFF)) {
            System.out.println("ZZZ");
            return;
        }
        System.out.println("trabaiando");    
        System.out.println("odeio segundas-feiras");
    }
}
