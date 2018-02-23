package command;

import logging.Logger;
import robot.ShovelBladeRobot;

public class StartCommand implements IRobotCommand {

    public void sendTo(ShovelBladeRobot robot) {
        Logger.instance.log("> StartCommand: Turning on robot");
        robot.start();
    }

    @Override
    public String toString() {
        return "StartCommand";
    }
}
