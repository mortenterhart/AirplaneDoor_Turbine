package monitoring;

import state.IDoorState;

public interface IStateObserver {
    void notifyStateChange(IDoorState state);
}
