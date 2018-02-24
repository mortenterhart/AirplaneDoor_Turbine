package command;

import blade.ShovelBlade;
import logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import robot.ShovelBladeRobot;
import turbine.AirplaneTurbine;

public class RobotRemoteControlTest {
    private static RobotRemoteControl remoteControl;
    private static ShovelBladeRobot robot;

    @BeforeAll
    public static void initializeRemoteControl() {
        Logger.instance.init();
        ShovelBlade.resetIndexCounter();
        AirplaneTurbine turbine = new AirplaneTurbine();
        robot = new ShovelBladeRobot(turbine.getBlades());
        remoteControl = new RobotRemoteControl(robot);
    }

    @Test
    public void testSendStartCommand() {
        remoteControl.setCommand(new StartCommand());
        remoteControl.pressButton();

        Assertions.assertTrue(robot.isTurnedOn());
    }

    @Test
    public void testSendNextBladeCommand() {
        robot.start();
        robot.resetPosition();
        robot.checkNext();
        int firstBladeIndex = robot.getCurrentBlade().getIndex();

        remoteControl.setCommand(new NextBladeCommand());
        remoteControl.pressButton();

        int secondBladeIndex = robot.getCurrentBlade().getIndex();

        Assertions.assertEquals(firstBladeIndex + 1, secondBladeIndex);

        robot.stop();
    }

    @Test
    public void testSendStopCommand() {
        robot.start();
        remoteControl.setCommand(new StopCommand());
        remoteControl.pressButton();

        Assertions.assertFalse(robot.isTurnedOn());
    }
}
