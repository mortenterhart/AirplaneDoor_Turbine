package blade;

import robot.IShovelBladeVisitor;

public abstract class ShovelBlade {
    private static int indexCounter = 1;
    protected int index = 0;

    protected ShovelBlade() {
        index = indexCounter;
        indexCounter++;
    }

    public abstract boolean checkFunctionality(IShovelBladeVisitor visitor);

    public int getIndex() {
        return index;
    }

    public static void resetIndexCounter() {
        indexCounter = 1;
    }
}
