package command;

import logging.Logger;
import robot.ShovelBladeRobot;

public class StopCommand implements IRobotCommand {

    public void sendTo(ShovelBladeRobot robot) {
        Logger.instance.log("> StopCommand: Turning off robot");
        robot.stop();
    }

    @Override
    public String toString() {
        return "StopCommand";
    }
}
