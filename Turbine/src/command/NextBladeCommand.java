package command;

import logging.Logger;
import robot.ShovelBladeRobot;

public class NextBladeCommand implements IRobotCommand {

    public void sendTo(ShovelBladeRobot robot) {
        if (robot.hasNextBlade()) {
            Logger.instance.log("> NextBladeCommand: Making the robot to check the next blade");
            robot.checkNext();
            return;
        }

        // Should never happen if programmer always uses hasNextBlade()
        Logger.instance.logError("> ERROR: NextBladeCommand: No more blades to check");
        Logger.instance.logError("> Turning robot off!");
        robot.stop();
    }

    @Override
    public String toString() {
        return "NextBladeCommand";
    }
}
