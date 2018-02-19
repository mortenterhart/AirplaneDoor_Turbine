package main;

import door.AirplaneDoor;
import monitoring.StateModificationObserver;
import state.IDoorState;

public class Application {

    private void execute() {
        AirplaneDoor door = new AirplaneDoor();
        door.addObserver(new StateModificationObserver());
        System.out.println(door);

        for (int i = 0; i < IDoorState.numberOfStates; i++) {
            door.promote();
            System.out.println(door);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.execute();
    }
}
