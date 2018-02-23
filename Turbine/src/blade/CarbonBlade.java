package blade;

import logging.Logger;
import robot.IShovelBladeVisitor;

public class CarbonBlade extends ShovelBlade {

    public CarbonBlade() {
        super();
    }

    public boolean checkFunctionality(IShovelBladeVisitor visitor) {
        Logger.instance.log("> CarbonBlade: Checking functionality of this CarbonBlade by visiting this element");
        return visitor.visit(this);
    }

    @Override
    public int getIndex() {
        return super.getIndex();
    }

    public boolean isIntact() {
        return true;
    }
}
