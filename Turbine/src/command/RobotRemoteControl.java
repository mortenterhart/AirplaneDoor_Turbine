package command;

import robot.TurbineRobot;

public class RobotRemoteControl {
    private TurbineRobot robot;
    private IRobotCommand command;

    public RobotRemoteControl(TurbineRobot robot) {
        this.robot = robot;
    }

    public void setCommand(IRobotCommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.sendTo(robot);
    }
}
