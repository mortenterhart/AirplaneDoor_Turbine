package command;

import robot.TurbineRobot;

public interface IRobotCommand {
    void sendTo(TurbineRobot robot);
}
