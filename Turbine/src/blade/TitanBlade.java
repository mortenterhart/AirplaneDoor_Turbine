package blade;

import logging.Logger;
import robot.IShovelBladeVisitor;

public class TitanBlade extends ShovelBlade {

    public TitanBlade() {
        super();
    }

    public boolean checkFunctionality(IShovelBladeVisitor visitor) {
        Logger.instance.log("> TitanBlade: Checking functionality of this TitanBlade by visiting this element");
        return visitor.visit(this);
    }

    @Override
    public int getIndex() {
        return super.getIndex();
    }

    public boolean isUndamaged() {
        return true;
    }
}
