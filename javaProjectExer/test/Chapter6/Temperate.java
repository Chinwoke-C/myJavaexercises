package Chapter6;

public class Temperate {


    public int ToCelsius(int degrees) {
        degrees = degrees - 273;

        return degrees;
    }

    public int ToKevin(int fahrenheit) {
        fahrenheit = fahrenheit + 273;
        return fahrenheit;
    }
}

