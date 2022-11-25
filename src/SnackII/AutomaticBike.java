package SnackII;

public class AutomaticBike {
 private int gear;
    private boolean isOn;
    private int speed;

    public void setOn(boolean value) {
        isOn = value;
    }

    public boolean getBikeIsOn() {
            return isOn;
        }

    public void setGear() {
            if (speed >= 0 && speed <= 20) {
           gear = 1;
            } else if (speed >= 21 && speed <= 30){
           gear = 2;
            } else if (speed >= 31 && speed <= 40){
            gear = 3;
            } else if (speed >= 41){
            gear = 4;
            }
    }
    public void accelerate() {
            if (gear == 1){
                speed++;
            } else if(gear == 2){
                speed +=2;
            } else if (gear == 3){
                speed += 3;
            } else if (gear == 4){
                speed+= 4;
            }
        setGear();
    }


    public void setSpeed(int speed) {
        this.speed = speed;
        setGear();
    }

    public int getspeed() {
        return speed; }
}
