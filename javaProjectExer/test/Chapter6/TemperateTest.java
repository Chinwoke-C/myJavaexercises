package Chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperateTest {
    Temperate temp;
    @BeforeEach
    void StartTestWith(){
        temp = new Temperate();
    }
    @Test
    void  TestCelsiusTemperature() {
        Temperate temp = new Temperate();
//        temperature can be converted to degree celsius
        assertEquals(-245, temp.ToCelsius(28));
    }
    @Test
    void TestFahrenheit(){
        assertEquals(301, temp.ToKevin(28));


    }


}