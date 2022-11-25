package snck;

public class AirConditioner {

    private boolean isOn;
    private int temperature;

    public void setOn(boolean value) {
        isOn = value;
    }

    public boolean getAcIsOn() {
        return isOn;
    }


    public int getTemp() {
        return temperature;
    }

    public void increaseTemp() {
        if (temperature < 30) {
            temperature = temperature + 1;
        }

    }

    public void decreaseTemp() {
        if (temperature > 16) {
            temperature = temperature - 1;
        }
    }

    public void setTemp(int degrees) {
            temperature = degrees;
    }
}







