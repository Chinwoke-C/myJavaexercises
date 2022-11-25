package Chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {
    @Test
    void constructorSetTest() {
        Human human = new Human();
        human.setFirstname("billy");
        human.setLastName("bully");
        human.setPhoneNumber("65678934567");
        human.setEmailAddress("hessmandis@scandal.uk");


        Native cohort = new Native(human);
        assertEquals("billy",cohort.getFirstname());

    }


}