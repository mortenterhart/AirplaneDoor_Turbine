package state;

import door.AirplaneDoor;

public class ClosedState implements IDoorState {
    private final String label = "S1";
    private final String stateDescription = "closed";

    public void promote(AirplaneDoor door) {
        door.setState(new LockedState());
    }

    public String getLabel() {
        return label;
    }

    public String getStateDescription() {
        return stateDescription;
    }
}
