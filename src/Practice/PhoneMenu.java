package Practice;


import java.util.Scanner;

public class PhoneMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Mazi's Phone");

        System.out.println("Press 1 to access the menu");
        int access = input.nextInt();

        System.out.println("""
                Press:
                1. Phonebook
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services""");
        int phone = input.nextInt();

//        while (true){
//            switch (access){
//                case 0:
//                    menu();
//                case 1:
//                    phonebook();
//                case 2:
//                    messages();
//                case 3:
//                    chat();
//                case 4:
//                    callRegister();
//                case 5:
//                   Tones();
//                case 6:
//                    settings();
//                case 7:
//                    callDivert();
//                case 8:
//                    games();
//                case 9:
//                    calculator();
//                case 10:
//                    reminders();
//                case 11:
//                    clock();
//                case 12:
//                    profiles();
//                case 13:
//                    simServices();
//
//            }
//
//        }
    }

    private static void phonebook() {
        System.out.println("Your Phone Book");
        System.out.println("""
                Press:
                1. Search
                2. Service Nos
                3. Add name
                4. Erase
                5. Edit
                6. Assign Tone
                7. Send business card
                8. Options
                9. Speed Dials
                10. Voice Tags
                0. Back
                00. Main menu""");
    }

    static Scanner input = new Scanner(System.in);
    public static void menu() {
        System.out.println("Press 1 for Menu");
        int menu = input.nextInt();

        System.out.println("""
                Press:
                1. Phonebook
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services""");
        int phone = input.nextInt();
    }
}
