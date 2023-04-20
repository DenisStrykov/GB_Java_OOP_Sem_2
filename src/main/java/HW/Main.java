package HW;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.setName("Робот");
        RoboTest roboTest = new RoboTest();

        roboTest.RobotOn();
        roboTest.StartBIOS(robot);
        roboTest.StartOS(robot);
        roboTest.StartMaster(robot);
        roboTest.SayHello(robot);

        roboTest.SayByeBye(robot);
        roboTest.SaveAllProgress(robot);
        roboTest.RobotOff();


    }

}
