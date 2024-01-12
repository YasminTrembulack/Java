package Robot;
import java.util.LinkedList;

public class RobotSpeed {
    
    private State state;
    private Double x = 0.0;
    private Double y = 0.0;
    private Double angle = 0.0;
    private static LinkedList<RobotSpeed> list = new LinkedList<RobotSpeed>();

    public RobotSpeed(){
        this.state = State.OFF;
        this.angle = 0.0;
        this.x = 0.0;
        this.y = 0.0;
        list.add(this);
    }

    public void setState(State value){
        this.state = value;
    }

    public void move(Move value){
        if(this.state.equals(State.OFF))
            return;

        x += value.getSpeed() * Math.cos(Math.toRadians(this.angle));
        y -= value.getSpeed() * Math.sin(Math.toRadians(this.angle));
    }

    public void rotate(Rotate dir){
        if(this.state.equals(State.OFF))
            return;
        
        this.angle += dir.getAngle();
    }
    

    public static void moveAll(Move value){
        for (RobotSpeed robot : list){
            robot.move(value);
        }

    }

    @Override
    public String toString(){
        return "(x " + x + " y " + y.toString() +")";
    }

}   

