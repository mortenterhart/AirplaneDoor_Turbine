package monitoring;

import logging.Logger;
import state.IDoorState;

public class StateModificationObserver implements IStateObserver {
    private int observerId = 0;
    private boolean wasNotified = false;

    public StateModificationObserver(int id) {
        observerId = id;
    }

    public void notifyStateChange(IDoorState state) {
        Logger.instance.log("StateModificationObserver " + observerId + " received message:");
        Logger.instance.log("> airplane door switched into state " + state.getLabel() + " (" +
                state.getStateDescription() + ")");
        wasNotified = true;
    }

    public boolean wasNotified() {
        return wasNotified;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (id " + observerId + ")";
    }
}
