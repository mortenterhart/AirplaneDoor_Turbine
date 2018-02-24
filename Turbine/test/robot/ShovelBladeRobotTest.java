package robot;

import blade.CarbonBlade;
import blade.ShovelBlade;
import blade.TitanBlade;
import logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import turbine.AirplaneTurbine;

public class ShovelBladeRobotTest {
    private static ShovelBladeRobot robot;

    @BeforeAll
    public static void buildBladesAndRobot() {
        Logger.instance.init();
        ShovelBlade.resetIndexCounter();
        AirplaneTurbine turbine = new AirplaneTurbine();
        robot = new ShovelBladeRobot(turbine.getBlades());
    }

    @Test
    public void testCheckMethodForCarbonBlade() {
        robot.start();

        Assertions.assertTrue(robot.visit(new CarbonBlade()));

        robot.stop();
    }

    @Test
    public void testCheckMethodForTitanBlade() {
        robot.start();

        Assertions.assertTrue(robot.visit(new TitanBlade()));

        robot.stop();
    }

    @Test
    public void testStartRobot() {
        robot.start();

        Assertions.assertTrue(robot.isTurnedOn());

        robot.stop();
    }

    @Test
    public void testRobotHasNextBlade() {
        robot.start();
        robot.resetPosition();

        Assertions.assertTrue(robot.hasNextBlade());

        robot.stop();
    }

    @Test
    public void testRobotCheckNextBladeNotNull() {
        robot.start();
        robot.resetPosition();
        robot.checkNext();

        Assertions.assertNotNull(robot.getCurrentBlade());

        robot.stop();
    }

    @Test
    public void testRobotProceedToNextBlade() {
        robot.start();
        robot.checkNext();

        int firstBladeIndex = robot.getCurrentBlade().getIndex();
        robot.checkNext();
        int secondBladeIndex = robot.getCurrentBlade().getIndex();

        Assertions.assertEquals(firstBladeIndex + 1, secondBladeIndex);

        robot.stop();
    }

    @Test
    public void testRobotResetsPositionToFirstBlade() {
        robot.start();
        robot.resetPosition();
        robot.checkNext();

        Assertions.assertEquals(1, robot.getCurrentBlade().getIndex());

        robot.stop();
    }

    @Test
    public void testNumberOfBladesEquals96() {
        Assertions.assertEquals(96, robot.getNumberOfBlades());
    }

    @Test
    public void testStopRobot() {
        robot.start();
        robot.stop();

        Assertions.assertFalse(robot.isTurnedOn());
    }
}
