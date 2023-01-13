package Chapter14Examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    @Test
public  void validateText(){
        assertTrue(Validator.validate("agent-005"));
    }
}