package EnumEStatic.Robot;


public class Main {
    public static void main(String[] args) {
        // EXEMPLO 1 (MyClass)
        //MyClass.Method();

        // MyClass x = new MyClass();
        // x.MethodB();

        // EXEMPLO 2 (MyClass)
        // MyClass x = new MyClass();
        // MyClass y = new MyClass();
        // MyClass z = new MyClass();

        //EXEMPLO 3 ENUM (Mode)

        // Mode fileMode = Mode.READ;
        // System.out.println(fileMode.canRead());                    
        // System.out.println(fileMode.canWrite());

        // if (fileMode.equals(Mode.READ)) {
        //     System.out.println("lendo o arquivo...");
        // }

        //EXEMPLO 4 (FileMode)
        // FileMode file_mode = FileMode.READ;
        // System.out.println(file_mode.canRead());                    
        // System.out.println(file_mode.canWrite());

        // if (file_mode.equals(FileMode.READ)) {
        //     System.out.println("lendo o arquivo...");
        // }

        //EXEMPLO 5 (State, Robot)

        // Robot robot = new Robot();
        // robot.run();
        // robot.setState(State.ON);
        // robot.run();
        // robot.setState(State.OFF);
        // robot.run();

        // for (/*var*/State value : State.values()){
        //     System.out.println(value);
        // }

        //EX Robot

        // ExRobot robot = new ExRobot();

        // robot.setState(State.ON);

        // robot.move(State.DIREITA);
        // robot.jump(State.CIMA);

        // System.out.println(robot);

    }    
}
