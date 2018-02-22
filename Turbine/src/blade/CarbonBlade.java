package blade;

import robot.IShovelBladeVisitor;

public class CarbonBlade extends ShovelBlade {

    public CarbonBlade() {
        super();
    }

    public boolean checkStatus(IShovelBladeVisitor visitor) {
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
