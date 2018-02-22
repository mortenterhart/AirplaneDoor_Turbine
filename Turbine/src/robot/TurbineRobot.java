package robot;

import blade.CarbonBlade;
import blade.TitanBlade;

public class TurbineRobot implements IShovelBladeVisitor {

    public boolean visit(CarbonBlade blade) {
        return blade != null && blade.isIntact();
    }

    public boolean visit(TitanBlade blade) {
        return blade != null && blade.isUndamaged();
    }

    public void next() {

    }
}
