package GraceSmallChops;

import java.util.Scanner;


class NokiaCellPhoneTest {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
           NokiaCellPhone myPhone = new NokiaCellPhone();
            System.out.println("""
                Welcome!
                Nokia connecting people
                Press 1 to access the menu:
                """);
            int option = input.nextInt();
            if(option == 1){
                myPhone.mainMenu();
            }

        }

    }

