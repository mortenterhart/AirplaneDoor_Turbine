package monitoring;

import door.AirplaneDoor;
import logging.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StateModificationObserverTest {
    private static AirplaneDoor door;

    @BeforeAll
    public static void init() {
        Logger.instance.init();
        door = new AirplaneDoor();
    }

    @Test
    public void testAddObserverIsRegistered() {
        IStateObserver observer = new StateModificationObserver(0);
        door.addObserver(observer);

        assertTrue(!door.getObservers().isEmpty());
        door.removeObserver(observer);
    }

    @Test
    public void testRemoveObserverIsRemoved() {
        IStateObserver observer = new StateModificationObserver(1);
        door.addObserver(observer);
        door.removeObserver(observer);

        assertTrue(door.getObservers().isEmpty());
    }

    @Test
    public void testDoorNotifiesObservers() {
        StateModificationObserver observer = new StateModificationObserver(2);
        door.addObserver(observer);
        door.pressButton();

        assertTrue(observer.wasNotified());
    }
}
