package blade;

import robot.IShovelBladeVisitor;

public abstract class ShovelBlade {
    private static int indexCounter = 0;
    protected int index = 0;

    protected ShovelBlade() {
        index = indexCounter;
        indexCounter++;
    }

    public abstract boolean checkStatus(IShovelBladeVisitor visitor);

    public int getIndex() {
        return index;
    }
}
