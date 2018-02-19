package main;

import door.AirplaneDoor;
import logging.Logger;
import monitoring.StateModificationObserver;
import state.IDoorState;

public class Application {

    private void init() {
        Logger.instance.init();
    }

    private void execute() {
        Logger.instance.log("## Start Application");
        AirplaneDoor door = new AirplaneDoor();
        door.addObserver(new StateModificationObserver(0));
        door.addObserver(new StateModificationObserver(1));
        Logger.instance.log("Initial State: " + door.toString());

        for (int i = 0; i < IDoorState.numberOfStates; i++) {
            door.pressButton();
            Logger.instance.log("State: " + door.toString());
            Logger.instance.newLine();
        }

        Logger.instance.log("## End Application");
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
