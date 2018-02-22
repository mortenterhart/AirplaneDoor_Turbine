package command;

import robot.TurbineRobot;

public class StopCommand implements IRobotCommand {

    public void sendTo(TurbineRobot robot) {
        robot.stop();
    }
}
