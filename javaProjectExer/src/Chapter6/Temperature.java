package Chapter6;

/*(Temperature Conversions) Implement the following integer methods:
        a) Method Kelvin returns the Kelvin equivalent of a Celsius temperature, using the calculation
        Kelvin = Celsius + 273.15;
        b) Method Celsius returns the Celsius equivalent of a Kelvin temperature, using the calculation
        Celsius = Kelvin - 273.15;
        c) Use the methods from parts (a) and (b) to write an application that enables the user to
        enter a Kelvin temperature and display the Celsius equivalent, or, to enter a Celsius
        temperature and display the Kelvin equivalent.*/


import java.util.Scanner;

public class Temperature {
    static int num;
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 to input a kelvin temperature or 0 for a celsius equivalent: ");
        int num = input.nextInt();

        System.out.println("Enter the temperature to convert: ");
        double temp = input.nextInt();

        if (num == 1){
            CelsiusTemp(temp);
        } else
            if (num == 0){
                kelvinTemp(temp);
            }
    }

    private static void CelsiusTemp(double celsius) {
        celsius = celsius - 273.15;
        System.out.printf("The temperature is %f degrees celsius", celsius);
    }

    private static void kelvinTemp(double kevin) {
         kevin = kevin + 273.15;
        System.out.printf("The temperature is %f degrees fahrenheit", kevin);
    }






}
