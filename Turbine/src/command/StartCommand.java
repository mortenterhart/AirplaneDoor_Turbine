package command;

import robot.TurbineRobot;

public class StartCommand implements IRobotCommand {

    public void sendTo(TurbineRobot robot) {
        robot.start();
    }
}
