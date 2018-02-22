package door;

import logging.Logger;
import monitoring.IStateObserver;
import state.IDoorState;

import java.util.ArrayList;
import java.util.List;

public class AirplaneDoor {
    private DoorButton button;
    private List<IStateObserver> listeners;

    public AirplaneDoor() {
        button = new DoorButton();
        listeners = new ArrayList<>();
    }

    public void pressButton() {
        Logger.instance.log("--- Button on AirplaneDoor was pressed (going into next state)");
        button.press(this);
    }

    public void addObserver(IStateObserver observer) {
        Logger.instance.log("--- Observer " + observer + " was added to listeners");
        listeners.add(observer);
    }

    public void removeObserver(IStateObserver observer) {
        listeners.remove(observer);
    }

    public List<IStateObserver> getObservers() {
        return listeners;
    }

    public void setState(IDoorState state) {
        Logger.instance.log("--- Door State was modified to " + state.getStateDescription());
        button.setState(state);
        notifyListeners(state);
    }

    public IDoorState getState() {
        return button.getState();
    }

    private void notifyListeners(IDoorState state) {
        Logger.instance.log("--- Notifying all listeners of state change");
        for (IStateObserver observer : listeners) {
            Logger.instance.log("> Sending notification to " + observer);
            observer.notifyStateChange(state);
            Logger.instance.newLine();
        }
    }

    @Override
    public String toString() {
        return "AirplaneDoor is " + button.getState().getStateDescription() +
                " (" + button.getState().getLabel() + ")";
    }
}
