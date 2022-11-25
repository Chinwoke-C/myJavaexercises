package tdd;

import Chief.Native;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NativeTest {
    private Native amira;
    private Native wunmi;

    @BeforeEach
    public void setUp(){
        amira = new Native();
        amira.setFirstName("Amira");
        amira.setLastName("Yusuf");
        amira.setNativeId("Scv1234");
        wunmi = new Native("Ade");
    }

    @Test
    public void checkNative(){
       assertNotNull(amira.getNativeId());
    }
    @Test
    public  void countNatives(){
        int nativeCount = amira.countNatives();
        assertEquals(1, nativeCount);
    }
}
