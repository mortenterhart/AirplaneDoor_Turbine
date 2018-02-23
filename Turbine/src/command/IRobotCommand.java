package command;

import robot.ShovelBladeRobot;

public interface IRobotCommand {
    void sendTo(ShovelBladeRobot robot);
}
