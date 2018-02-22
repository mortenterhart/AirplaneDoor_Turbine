package main;

import blade.CarbonBlade;
import blade.ShovelBlade;
import logging.Logger;
import robot.TurbineRobot;
import turbine.AirplaneTurbine;

public class Application {

    private void init() {
        Logger.instance.init();
    }

    private void execute() {
        AirplaneTurbine turbine = new AirplaneTurbine();
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
