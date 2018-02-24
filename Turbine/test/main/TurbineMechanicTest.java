package main;

import blade.ShovelBlade;
import logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import robot.ShovelBladeRobot;
import turbine.AirplaneTurbine;

public class TurbineMechanicTest {
    private static ShovelBladeRobot robot;
    private static TurbineMechanic mechanic;

    @BeforeAll
    public static void buildRobotAndMechanic() {
        Logger.instance.init();
        ShovelBlade.resetIndexCounter();
        AirplaneTurbine turbine = new AirplaneTurbine();
        robot = new ShovelBladeRobot(turbine.getBlades());
        mechanic = new TurbineMechanic(robot);
    }

    @Test
    public void testMechanicSendsCommandToTurnRobotOn() {
        robot.resetPosition();
        mechanic.turnRobotOn();

        Assertions.assertTrue(robot.isTurnedOn());
    }

    @Test
    public void testRobotChecksAllBladesAfterMechanicCommand() {
        robot.resetPosition();
        mechanic.turnRobotOn();
        mechanic.testAllBlades();

        Assertions.assertEquals(96, robot.getCurrentBlade().getIndex());
    }

    @Test
    public void testMechanicSendsCommandToTurnRobotOff() {
        robot.resetPosition();
        mechanic.turnRobotOn();
        mechanic.turnRobotOff();

        Assertions.assertFalse(robot.isTurnedOn());
    }
}
