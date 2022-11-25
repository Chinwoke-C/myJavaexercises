package SnackII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBikeTest {
    @Test
    public void TurnOnBikeTest() {
        //I have an automatic bike(precondition)
        AutomaticBike powerBike = new AutomaticBike();
        //Turn on bike(action)
        powerBike.setOn(true);
        //check that bike is on
        assertTrue(powerBike.getBikeIsOn());
    }

    @Test
    public void TurnOffBikeTest() {
        //There is a bike(precondition)
        AutomaticBike powerBike = new AutomaticBike();
        //Turn on the  bike
        powerBike.setOn(true);
        //check that it is on
        assertEquals(true, powerBike.getBikeIsOn());
        //Turn off bike(action)
        powerBike.setOn(false);
        //check that bike is off(test)
        assertEquals(false, powerBike.getBikeIsOn());
    }
    @Test
    public void accelerate1stGearTest(){
        //There is a bike(precondition)
        AutomaticBike powerBike = new AutomaticBike();
        //Turn on the  bike
        powerBike.setOn(true);
        //initial speed = 0
            powerBike.setSpeed(0);
         //accelerate the bike
           powerBike.accelerate();
            assertEquals(1, powerBike.getspeed());
    }
    @Test
    public void accelerate2ndGear(){
        //There is a bike(precondition)
        AutomaticBike powerBike = new AutomaticBike();
        //Turn on the  bike
        powerBike.setOn(true);
        //current speed = 24
        powerBike.setSpeed(24);
        //accelerate the bike
        powerBike.accelerate();
        assertEquals(26 , powerBike.getspeed());
    }
    @Test
    public void accelerate3rdGear(){
        //There is a bike(precondition)
        AutomaticBike powerBike = new AutomaticBike();
        //Turn on the  bike
        powerBike.setOn(true);
        //current speed = 35
        powerBike.setSpeed(35);
        //accelerate the bike
        powerBike.accelerate();
        assertEquals(38 , powerBike.getspeed());
    }
    @Test
    public void accelerate4thGear(){
        //There is a bike(precondition)
        AutomaticBike powerBike = new AutomaticBike();
        //Turn on the  bike
        powerBike.setOn(true);
        //current speed = 35
        powerBike.setSpeed(44);
        //accelerate the bike
        powerBike.accelerate();
        assertEquals(48 , powerBike.getspeed());
    }

}