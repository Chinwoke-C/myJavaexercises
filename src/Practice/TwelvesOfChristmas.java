package Practice;


//import java.util.Scanner;(“The Twelve Days of Christmas” Song) Write an application that uses iteration and switch
//        statements to print the song “The Twelve Days of Christmas.” One switch statement should be
//        used to print the day (“first,” “second,” and so on). A separate switch statement should be used to
//        print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_
//        of_Christmas_(song) for the lyrics of the s

public class TwelvesOfChristmas {
    public static void main(String[] args) {
      for (int day = 1; day <= 12 ; day++) {
          System.out.println("On the ");

        switch (day){
            case 1:
                System.out.println("First");
                break;
            case 2:
                System.out.println("Second");
                break;
            case 3:
                System.out.println("Third");
                break;
            case 4:
                System.out.println("Fourth");
                break;
            case 5:
                System.out.println("Fifth");
                break;
            case 6:
                System.out.println("Sixth");
                      break;
            case 7:
                System.out.println("Seventh");
                break;
            case 8:
                System.out.println("Eighth");
                break;
            case  9:
                System.out.println("Ninth");
                break;
            case 10:
                System.out.println("Tenth");
                break;
            case 11:
                System.out.println("Eleventh");
                break;
            case 12:
                System.out.println("Twelfth");
                break;
                }
            System.out.println(" day of christmas, my true love sent to me ");

            switch(day){
                case 12:
                        System.out.println("Twelve drummers drumming");
                    case 11:
                        System.out.println("Eleven pipers piping");
                    case 10:
                        System.out.println("Ten lords a-leaping");
                    case 9:
                        System.out.println("Nine ladies dancing");
                    case 8:
                        System.out.println("Eight maids a-milking");
                    case 7:
                        System.out.println("Seven swans are swimming");
                    case 6:
                        System.out.println("Six geese a- laying");
                    case 5:
                        System.out.println("Five golden rings!");
                    case 4:
                        System.out.println("four calling birds");
                    case 3:
                        System.out.println("Three french hens");
                    case 2:
                        System.out.println("Two turtle doves");
                    case 1:
                        System.out.println(" and a partridge in a pear tree!");
            }
                System.out.println();
        }
    }
}



