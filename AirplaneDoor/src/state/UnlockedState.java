package state;

import door.AirplaneDoor;

public class UnlockedState implements IDoorState {
    private final String label = "S3";
    private final String stateDescription = "unlocked";

    public void promote(AirplaneDoor door) {
        door.setState(new OpenState());
    }

    public String getLabel() {
        return label;
    }

    public String getStateDescription() {
        return stateDescription;
    }
}
