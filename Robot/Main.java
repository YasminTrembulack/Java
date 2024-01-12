package Robot;

public class Main {
    public static void main(String[] args) {

        RobotSpeed robot1 = new RobotSpeed();
        RobotSpeed robot2 = new RobotSpeed();

        robot1.setState(State.ON);
        robot2.setState(State.ON);

        robot1.rotate(Rotate.RIGHT_30);
        robot1.move(Move.BEHIND_1);

        RobotSpeed.moveAll(Move.AHEAD_2);
        RobotSpeed.moveAll(Move.AHEAD_2);
        
        System.out.println(robot1);
        System.out.println(robot2);  
    }
}
