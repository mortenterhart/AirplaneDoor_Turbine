package door;

import monitoring.StateModificationObserver;
import state.IDoorState;

import java.util.ArrayList;
import java.util.List;

public class AirplaneDoor {
    private DoorButton button;
    private List<StateModificationObserver> listeners;

    public AirplaneDoor() {
        button = new DoorButton();
        listeners = new ArrayList<>();
    }

    public void promote() {
        button.promote(this);
    }

    public void addObserver(StateModificationObserver observer) {
        listeners.add(observer);
    }

    public void setState(IDoorState state) {
        button.setState(state);

        for (StateModificationObserver observer : listeners) {
            observer.stateChangedTo(state);
        }
    }

    @Override
    public String toString() {
        return "AirplaneDoor is " + button.getState().getStateDescription() +
                " (" + button.getState().getLabel() + ")";
    }
}
