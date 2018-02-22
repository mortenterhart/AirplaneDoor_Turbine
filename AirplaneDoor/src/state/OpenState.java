package state;

import door.AirplaneDoor;

public class OpenState implements IDoorState {
    private final String label = "S0";
    private final String stateDescription = "open";

    public void applyNewState(AirplaneDoor door) {
        door.setState(new ClosedState());
    }

    public String getLabel() {
        return label;
    }

    public String getStateDescription() {
        return stateDescription;
    }
}
