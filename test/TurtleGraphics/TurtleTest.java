package TurtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static TurtleGraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;
    @BeforeEach
    void startAllTestWith(){
        turtle = new Turtle();
    }
    @Test
    void penUpTest(){
        turtle.penUp();
        assertTrue(turtle.isPenUp());
    }
    @Test
    void penDownTest(){
    turtle.penDown();
    assertFalse(turtle.isPenUp());

}
    @Test
    void turnRightWhileFacingEastTest(){
        turtle.turnRight();
        assertEquals(SOUTH,turtle.getCurrentDirection());
    }
    @Test
    void turnRightWhileFacingSouthTest(){
        turtle.turnRight();
        assertEquals(SOUTH,turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST,turtle.getCurrentDirection());
    }
    @Test
    void turnRightToFaceNorthTest(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }
    @Test
    void turnRightToFaceEast(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(EAST,turtle.getCurrentDirection());
    }
    @Test
    void turnLeftWhileFacingEastTest(){
        turtle.turnLeft();
        assertEquals(NORTH,turtle.getCurrentDirection());
    }
    @Test
    void moveForwardTest(){
        turtle.move(5);
        assertEquals(new Position(0,5),turtle.getCurrentPosition());
    }
    @Test
    void moveBackWardTest(){
        turtle.move(10);
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.move(3);
        assertEquals(new Position(0, 7),turtle.getCurrentPosition());
    }
}