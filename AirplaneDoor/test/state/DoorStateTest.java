package state;

import door.AirplaneDoor;
import logging.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DoorStateTest {
    private static AirplaneDoor door;

    @BeforeAll
    public static void init() {
        Logger.instance.init();
        door = new AirplaneDoor();
    }

    @Test
    public void testOpenStateTurnsToClosed() {
        door.setState(new OpenState());
        door.pressButton();

        assertTrue(door.getState() instanceof ClosedState);
    }

    @Test
    public void testClosedStateTurnsToLocked() {
        door.setState(new ClosedState());
        door.pressButton();

        assertTrue(door.getState() instanceof LockedState);
    }

    @Test
    public void testLockedStateTurnsToUnlocked() {
        door.setState(new LockedState());
        door.pressButton();

        assertTrue(door.getState() instanceof UnlockedState);
    }

    @Test
    public void testUnlockedStateTurnsToOpen() {
        door.setState(new UnlockedState());
        door.pressButton();

        assertTrue(door.getState() instanceof OpenState);
    }
}
