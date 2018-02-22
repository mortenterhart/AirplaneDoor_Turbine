package robot;

import blade.CarbonBlade;
import blade.ShovelBlade;
import blade.TitanBlade;

import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class TurbineRobot implements IShovelBladeVisitor {
    private List<ShovelBlade> blades;
    private ListIterator<ShovelBlade> listIterator;
    private boolean robotTurnedOff = true;

    public TurbineRobot(List<ShovelBlade> turbineBlades) {
        blades = turbineBlades;
        listIterator = turbineBlades.listIterator();
    }

    public boolean visit(CarbonBlade blade) {
        return blade != null && blade.isIntact();
    }

    public boolean visit(TitanBlade blade) {
        return blade != null && blade.isUndamaged();
    }

    public void start() {
        robotTurnedOff = false;
    }

    public boolean hasNextBlade() {
        return !robotTurnedOff && listIterator.hasNext();
    }

    public void checkNext() {
        if (hasNextBlade()) {
            boolean checkSuccessful = listIterator.next().checkStatus(this);
            System.out.println(checkSuccessful);
            return;
        }

        throw new NoSuchElementException();
    }

    public void stop() {
        robotTurnedOff = true;
    }
}
