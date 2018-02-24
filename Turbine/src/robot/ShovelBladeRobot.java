package robot;

import blade.CarbonBlade;
import blade.ShovelBlade;
import blade.TitanBlade;
import logging.Logger;

import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ShovelBladeRobot implements IShovelBladeVisitor {
    private List<ShovelBlade> blades;
    private ListIterator<ShovelBlade> listIterator;
    private ShovelBlade currentBlade;
    private boolean robotTurnedOn = false;

    public ShovelBladeRobot(List<ShovelBlade> turbineBlades) {
        Logger.instance.log("--- Creating ShovelBladeRobot with list of blades and ListIterator");
        blades = turbineBlades;
        listIterator = turbineBlades.listIterator();
    }

    public boolean visit(CarbonBlade blade) {
        Logger.instance.log("> ShovelBladeRobot: Visiting this CarbonBlade and checking if it is intact");
        return robotTurnedOn && blade != null && blade.isIntact();
    }

    public boolean visit(TitanBlade blade) {
        Logger.instance.log("> ShovelBladeRobot: Visiting this TitanBlade and checking if it is undamaged");
        return robotTurnedOn && blade != null && blade.isUndamaged();
    }

    public void start() {
        Logger.instance.log("> ShovelBladeRobot: Starting robot ...\n");
        turnOn();
    }

    public boolean hasNextBlade() {
        return robotTurnedOn && listIterator.hasNext();
    }

    public void checkNext() throws NoSuchElementException {
        if (hasNextBlade()) {
            currentBlade = listIterator.next();
            boolean checkSuccessful = currentBlade.checkFunctionality(this);
            Logger.instance.log("> ShovelBladeRobot: Check of this blade was " +
                    (checkSuccessful ? "successful" : "not successful"));
            Logger.instance.log("    Blade is fully functional\n");
            return;
        }

        Logger.instance.logError("> ERROR: ShovelBladeRobot: Reached end of blade stream or robot turned off");
        throw new NoSuchElementException("Either robot is turned off or reached end of blade stream " +
                "(use method hasNextBlade() in that case)");
    }

    public void resetPosition() {
        Logger.instance.log("> ShovelBladeRobot: Resetting the robot's position and starting again from index 1");
        currentBlade = null;
        listIterator = blades.listIterator();
    }

    public void stop() {
        Logger.instance.log("> ShovelBladeRobot: Stopping robot ...\n");
        turnOff();
    }

    private void turnOn() {
        robotTurnedOn = true;
    }

    private void turnOff() {
        robotTurnedOn = false;
    }

    public int getNumberOfBlades() {
        return blades.size();
    }

    public ShovelBlade getCurrentBlade() {
        return currentBlade;
    }

    public boolean isTurnedOn() {
        return robotTurnedOn;
    }
}
