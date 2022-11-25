package Turtle;


import Turtle.Enums.Cardinal;

public class Turtle {
    private int xCordinate;
    private int yCordinate;
    private Cardinal direction = Cardinal.EAST;
    private Pencil pen;

    public Turtle(){
    }
    public Turtle(int x, int y){
    xCordinate = x;
    yCordinate = y;
    }

    public int getxCordinate() {
        return xCordinate;
    }

    public void setxCordinate(int xCordinate) {
        this.xCordinate = xCordinate;
    }

    public int getyCordinate() {
        return yCordinate;
    }

    public void setyCordinate(int yCordinate) {
        this.yCordinate = yCordinate;
    }

    public Cardinal getDirection() {
        return direction;
    }

    public void setDirection(Cardinal direction) {
        this.direction = direction;
    }

    public Pencil getPen() {
        return pen;
    }

    public void setPencil(Pencil pen) {
        this.pen = pen;
    }
}
