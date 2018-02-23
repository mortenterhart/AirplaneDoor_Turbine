package command;

import logging.Logger;
import robot.ShovelBladeRobot;

public class RobotRemoteControl {
    private ShovelBladeRobot robot;
    private IRobotCommand command;

    public RobotRemoteControl(ShovelBladeRobot robot) {
        Logger.instance.log("--- Creating RobotRemoteControl with access to ShovelBladeRobot");
        this.robot = robot;
    }

    public void setCommand(IRobotCommand command) {
        Logger.instance.log("> RobotRemoteControl: Registering new command " + command.toString());
        this.command = command;
    }

    public void pressButton() {
        Logger.instance.log("> RobotRemoteControl: Executing command " + command.toString() + " and " +
                "sending to robot");
        command.sendTo(robot);
    }
}
