package HW;

import java.util.ArrayList;
import java.util.List;

public class RoboTest implements TestOn,TestOff {

    List<Robot> robot = new ArrayList<>();


    @Override
    public void SayByeBye(Robot robot) {
        System.out.println(robot.getName() + " сказал: пока");
    }

    @Override
    public void SaveAllProgress(Robot robot) {
        System.out.println(robot.getName() + " сохранил изменения");
    }

    @Override
    public void RobotOff() {

    }

    @Override
    public void RobotOn() {

    }

    @Override
    public void StartBIOS(Robot robot) {
        System.out.println(robot.getName() + " загрузил BIOS");
    }

    @Override
    public void StartOS(Robot robot) {
        System.out.println(robot.getName() + " загрузил ОС");
    }

    @Override
    public void StartMaster(Robot robot) {
        System.out.println(robot.getName() + " готов к работе");
    }

    @Override
    public void SayHello(Robot robot) {
        System.out.println(robot.getName() + " сказал: привет");
    }
}
