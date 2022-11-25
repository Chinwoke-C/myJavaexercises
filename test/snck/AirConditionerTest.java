package snck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    @Test
    public void TurnAcOnTest() {
        //Have an AC
        AirConditioner myAc = new AirConditioner();
        // Turn on the AC
        myAc.setOn(true);
        // Check that AC is On
        assertEquals(true, myAc.getAcIsOn());
    }

    @Test
    public void TurnAcOffTest() {
        //Have an AC
        AirConditioner myAc = new AirConditioner();
        //The AC is on
        myAc.setOn(true);
        //Turn off the AC
         myAc.setOn(false);
         //check that it is off
         assertEquals(false,myAc.getAcIsOn());
    }
@Test
    public void increaseTempTest(){
        //have an AC
     AirConditioner myAc = new AirConditioner();
    //the AC is on
         myAc.setOn(true);
    //initial temperature is 0
         assertEquals(0,myAc.getTemp());
    //increase Temperature
         myAc.increaseTemp();
    //check that temperature increased to 1
        assertEquals(1,myAc.getTemp());
    }
@Test
    public void decreaseTempTest(){
    //have an AC
    AirConditioner myAc = new AirConditioner();
    //the AC is on
    myAc.setOn(true);
    //initial temperature is 17
    myAc.setTemp(17);
    //decrease Temperature
    myAc.decreaseTemp();
    //check that temperature increased
    assertEquals(16,myAc.getTemp());
    }
    @Test
    public void maxTempTest(){
           //There is an AC
        AirConditioner myAc = new AirConditioner();
        //the AC is on
        myAc.setOn(true);
        //Temperature is 30
        myAc.setTemp(19);
        //increase Temperature
        myAc.increaseTemp();
        //check that temperature is still 30
        assertEquals(20,myAc.getTemp());
    }
    @Test
    public void minimumTemperatureTest(){
        //There is an AC
        AirConditioner myAc = new AirConditioner();
        //the AC is on
        myAc.setOn(true);
        //Temperature is 16
        myAc.setTemp(16);
        //decrease Temperature
        myAc.decreaseTemp();
        //check that temperature is still 16
        assertEquals(16,myAc.getTemp());
    }
}






