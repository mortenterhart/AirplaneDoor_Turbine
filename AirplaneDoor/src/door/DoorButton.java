package door;

import state.IDoorState;
import state.OpenState;

public class DoorButton {
    private IDoorState state;

    public DoorButton() {
        // Initial door state
        state = new OpenState();
    }

    public void setState(IDoorState state) {
        this.state = state;
    }

    public IDoorState getState() {
        return state;
    }

    public void press(AirplaneDoor door) {
        state.applyNewState(door);
    }
}
