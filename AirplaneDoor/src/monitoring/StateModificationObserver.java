package monitoring;

import logging.Logger;
import state.IDoorState;

public class StateModificationObserver implements IStateObserver {
    private int observerId = 0;

    public StateModificationObserver(int id) {
        observerId = id;
    }

    public void notifyStateChange(IDoorState state) {
        Logger.instance.log("StateModificationObserver " + observerId + " received message:");
        Logger.instance.log("> airplane door switched into state " + state.getLabel() + " (" +
                state.getStateDescription() + ")");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (id " + observerId + ")";
    }
}
