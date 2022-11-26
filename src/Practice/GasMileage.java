package Practice;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double milePerGallonused;
        int mile = 0;
        int counter = 0;
        int gallon = 0;
        int totalMile = 0;
        int totalGallon = 0;


        while (mile != -1 && gallon != -1){
            System.out.print("Enter mile or -1 to quit: ");
            mile = input.nextInt();
            System.out.print("Enter gallons used: ");
            gallon = input.nextInt();

            totalMile += mile;
            totalGallon += gallon;
            double milePerGallon = (double) mile / gallon;
            System.out.printf("The mile per gallon used for this trip is: %.2f", milePerGallon);
            counter++;
            System.out.println();
        }
            milePerGallonused = totalMile / totalGallon;

            System.out.printf("The combined milePerGallon used for all trip is: %.2f", milePerGallonused);

        }

}



