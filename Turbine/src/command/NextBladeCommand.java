package command;

import robot.TurbineRobot;

public class NextBladeCommand implements IRobotCommand {

    public void sendTo(TurbineRobot robot) {
        if (robot.hasNextBlade()) {
            robot.checkNext();
            return;
        }

        robot.stop();
    }
}
