package main;

import logging.Logger;
import robot.ShovelBladeRobot;
import turbine.AirplaneTurbine;

public class Application {

    private void init() {
        Logger.instance.init();
    }

    private void execute() {
        Logger.instance.log("## Start Turbine\n");
        AirplaneTurbine turbine = new AirplaneTurbine();
        ShovelBladeRobot robot = new ShovelBladeRobot(turbine.getBlades());
        TurbineMechanic mechanic = new TurbineMechanic(robot);
        Logger.instance.newLine();

        mechanic.turnRobotOn();
        mechanic.testAllBlades();
        mechanic.turnRobotOff();
        Logger.instance.log("## End Turbine");
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
