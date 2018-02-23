package main;

import command.NextBladeCommand;
import command.RobotRemoteControl;
import command.StartCommand;
import command.StopCommand;
import logging.Logger;
import robot.ShovelBladeRobot;

public class TurbineMechanic {
    private RobotRemoteControl remoteControl;
    private int numberOfBlades = 0;

    public TurbineMechanic(ShovelBladeRobot robot) {
        Logger.instance.log("--- Creating TurbineMechanic using ShovelBladeRobot with a RobotRemoteControl");
        remoteControl = new RobotRemoteControl(robot);
        numberOfBlades = robot.getNumberOfBlades();
    }

    public void turnRobotOn() {
        Logger.instance.log("> TurbineMechanic: Sending command to turn robot on");
        remoteControl.setCommand(new StartCommand());
        remoteControl.pressButton();
    }

    public void testAllBlades() {
        Logger.instance.log("> TurbineMechanic: Sending commands that are checking all blades successively");
        for (int i = 1; i <= numberOfBlades; i++) {
            Logger.instance.log("  > Sending command NextBlade to check blade " + i + " for functionality");
            remoteControl.setCommand(new NextBladeCommand());
            remoteControl.pressButton();
        }
    }

    public void turnRobotOff() {
        Logger.instance.log("> TurbineMechanic: Sending command to turn robot off");
        remoteControl.setCommand(new StopCommand());
        remoteControl.pressButton();
    }
}
