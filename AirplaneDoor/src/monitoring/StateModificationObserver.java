package monitoring;

import state.IDoorState;

public class StateModificationObserver {

    public void stateChangedTo(IDoorState state) {
        System.out.println("StateModificationObserver received message:");
        System.out.println("> airplane door switched into state " + state.getLabel() + " (" +
                state.getStateDescription() + ")");
    }
}
