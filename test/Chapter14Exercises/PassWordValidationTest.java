package Chapter14Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class PassWordValidationTest {
    PassWordValidation passWordValidation;
    @BeforeEach
    public  void setUp(){
        passWordValidation = new PassWordValidation("Jane");
    }
    @Test
    public  void passwordValidationExists(){
        PassWordValidation passWordValidation = new PassWordValidation("Jane");
        assertNotNull(passWordValidation);
    }

    @Test
    public void passwordValidationCanValidate(){
        boolean valid = passWordValidation.validate("June");
        assertTrue(valid);

    }

}