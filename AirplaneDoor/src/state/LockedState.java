package state;

import door.AirplaneDoor;

public class LockedState implements IDoorState {
    private final String label = "S2";
    private final String stateDescription = "locked";

    public void promote(AirplaneDoor door) {
        door.setState(new UnlockedState());
    }

    public String getLabel() {
        return label;
    }

    public String getStateDescription() {
        return stateDescription;
    }
}
