package blade;

import robot.IShovelBladeVisitor;

public class TitanBlade extends ShovelBlade {

    public TitanBlade() {
        super();
    }

    public boolean checkStatus(IShovelBladeVisitor visitor) {
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
