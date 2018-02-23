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
    private boolean robotTurnedOff = true;

    public ShovelBladeRobot(List<ShovelBlade> turbineBlades) {
        Logger.instance.log("--- Creating ShovelBladeRobot with list of blades and ListIterator");
        blades = turbineBlades;
        listIterator = turbineBlades.listIterator();
    }

    public boolean visit(CarbonBlade blade) {
        Logger.instance.log("> ShovelBladeRobot: Visiting this CarbonBlade and checking if it is intact");
        return blade != null && blade.isIntact();
    }

    public boolean visit(TitanBlade blade) {
        Logger.instance.log("> ShovelBladeRobot: Visiting this TitanBlade and checking if it is undamaged");
        return blade != null && blade.isUndamaged();
    }

    public void start() {
        Logger.instance.log("> ShovelBladeRobot: Starting robot ...\n");
        turnOn();
    }

    public boolean hasNextBlade() {
        return !robotTurnedOff && listIterator.hasNext();
    }

    public void checkNext() throws NoSuchElementException {
        if (hasNextBlade()) {
            boolean checkSuccessful = listIterator.next().checkFunctionality(this);
            Logger.instance.log("> ShovelBladeRobot: Check of this blade was " +
                    (checkSuccessful ? "successful" : "not successful"));
            Logger.instance.log("    Blade is fully functional\n");
            return;
        }

        Logger.instance.logError("> ERROR: ShovelBladeRobot: Reached end of blade stream or robot turned off");
        throw new NoSuchElementException("Either robot is turned off or reached end of blade stream " +
                "(use method hasNextBlade() in that case)");
    }

    public void stop() {
        Logger.instance.log("> ShovelBladeRobot: Stopping robot ...\n");
        turnOff();
    }

    private void turnOn() {
        robotTurnedOff = false;
    }

    private void turnOff() {
        robotTurnedOff = true;
    }

    public int getNumberOfBlades() {
        return blades.size();
    }
}
