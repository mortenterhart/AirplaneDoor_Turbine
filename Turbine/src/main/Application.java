package main;

import command.NextBladeCommand;
import command.RobotRemoteControl;
import command.StartCommand;
import logging.Logger;
import robot.TurbineRobot;
import turbine.AirplaneTurbine;

public class Application {

    private void init() {
        Logger.instance.init();
    }

    private void execute() {
        AirplaneTurbine turbine = new AirplaneTurbine();
        TurbineRobot robot = new TurbineRobot(turbine.getBlades());
        RobotRemoteControl control = new RobotRemoteControl(robot);

        control.setCommand(new StartCommand());
        control.pressButton();

        for (int i = 0; i < turbine.getBlades().size(); i++) {
            control.setCommand(new NextBladeCommand());
            control.pressButton();
        }
    }

    private void prepareShutdown() {
        Logger.instance.close();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.init();
        application.execute();
        application.prepareShutdown();
    }
}
