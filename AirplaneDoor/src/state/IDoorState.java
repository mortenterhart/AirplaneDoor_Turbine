package state;

import door.AirplaneDoor;

public interface IDoorState {
    int numberOfStates = 4;

    void promote(AirplaneDoor door);

    String getStateDescription();

    String getLabel();
}
