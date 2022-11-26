package GraceSmallChops;

import java.util.Scanner;

public class NokiaCellPhone {

        private int phoneBook;
        private int messages;
        private int chat;
        private int callRegister;
        private int phoneMenu;
        private int tones;
        private int settings;
        private int callDivert;
        private int games;
        private int calculator;
        private int reminder;
        private int clock;
        private int profiles;
        private int simServices;
        Scanner input = new Scanner(System.in);
        public  void mainMenu(){
            System.out.println("""
                1: PhoneBook
                2: Messages
                3: chat
                4: Call Register
                5: Tones
                6: Settings
                7: Call Divert
                8: Games
                9: calculator
                10: Reminder
                11: Clock
                12: Profiles
                13: Sim services
                14: Switch off
                """);

            System.out.println("pick an option: ");
            int option = input.nextInt();

            switch (option){
                case 1:
                    phoneBook();
                case 2:
                    messages();
                case 3:
                    Chat();
                case 4:
                    callRegister();
                case 5:
                    toneSettings();
                case 6:
                    settings();
                case 7:
                    callDivert();
                case 8:
                    games();
                case 9:
                    calculator();
                case  10:
                    reminder();
                case 11:
                    clock();
                case 12:
                    profiles();
                case 13:
                    simServices();
                    case 14:
                        switchOff();
            }
        }

        public void simServices() {
            System.out.println("enter 99 to go back ");
            int option = input.nextInt();
            mainMenu();
        }

        public void profiles() {
            System.out.println("enter 99 to go back ");
            int option = input.nextInt();
            mainMenu();
        }

        public void clock() {
            System.out.println("""
                            Clock
                            1: Alarm clock
                            2: clock setting
                            3: Date setting
                            4: Stopwatch
                            5: Countdown timer
                            6: Auto update of date and time
                            """);
            System.out.println("Pick an option or enter 99 to go back ");
            int option = input.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Alarm clock");
                    clock();
                }
                case 2 -> {
                    System.out.println("Clock Settings");
                    clock();
                }
                case 3 -> {
                    System.out.println("Date settings");
                    clock();
                }
                case 4 -> {
                    System.out.println("Stopwatch");
                    clock();
                }
                case 5 -> {
                    System.out.println("Countdown timer");
                    clock();
                }
                case 6 -> {
                    System.out.println("Auto update of date and time");
                    clock();
                }
            }

        }

        public void reminder() {
            System.out.println("enter 99 to go back ");
            int option = input.nextInt();
            mainMenu();
        }

        public void calculator() {
            System.out.println("enter 99 to go back ");
            int option = input.nextInt();
            mainMenu();
        }

        public void games() {
            System.out.println("enter 99 to go back ");
            int option = input.nextInt();
            mainMenu();
        }

        public void callDivert() {
            System.out.println("enter 99 to go back ");
            int option = input.nextInt();
            mainMenu();
        }

        public void settings() {
            System.out.println("""
                                Settings
                                1: Call settings
                                2: Phone settings
                                3: Security settings
                                4: Restore factory setting
                                """);
            System.out.println("Pick an option or enter 99 to go back ");
            int option = input.nextInt();

            switch (option){
                case 1:
                    callSettings();
                    settings();
                    break;
                case 2:
                    phoneSettings();
                    settings();
                    break;
                case 3:
                    securitySettings();
                    settings();
                    break;
                case 4:
                    System.out.println("Restore factory settings");
                    settings();
                    break;
            }
        }

        public void securitySettings() {
            System.out.println("""
                                            Security settings
                                            1: Pin code request
                                            2: Call barring service
                                            3: fixed dialling
                                            4: closed user group
                                            5: Phone security
                                            6: Change access codes""");
            System.out.println("Pick an option or enter 99 to go back ");
            int option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Pin code Settings");
                    securitySettings();
                    break;
                case 2:
                    System.out.println("Call barring settings");
                    securitySettings();
                    break;
                case 3:
                    System.out.println("Fixed dialing");
                    securitySettings();
                    break;
                case 4:
                    System.out.println("Closed user group");
                    securitySettings();
                    break;
                case 5:
                    System.out.println("Phone security");
                    securitySettings();
                    break;
                case 6:
                    System.out.println("Change access codes");
                    securitySettings();
                    break;
                case 99:
                    settings();
                    break;
            }
        }

        public void phoneSettings() {
            System.out.println("""
                                            Phone settings
                                            1: Language
                                            2: cell info display
                                            3: Welcome note
                                            4: Network selection
                                            5: lights
                                            6: confirm sim service actions""");
            System.out.println("Pick an option or enter 99 to go back ");
            int option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Language");
                    phoneSettings();
                    break;
                case 2:
                    System.out.println("Cell info display");
                    phoneSettings();
                    break;
                case 3:
                    System.out.println("Welcome note");
                    phoneSettings();
                    break;
                case 4:
                    System.out.println("Network Selection");
                    phoneSettings();
                    break;
                case 5:
                    System.out.println("Lights");
                    phoneSettings();
                    break;
                case 6:
                    System.out.println("Confirm SIM service actions");
                    phoneSettings();
                    break;
                case 99:
                    settings();
                    break;
            }
        }

        public void callSettings() {
            System.out.println("""
                                            Call settings
                                            1: Automatic redial
                                            2: Speed dialing
                                            3: call waiting options
                                            4: Own number sending
                                            5: Phone line in use
                                            6: Automatic answer
                                            """);
            System.out.println("Pick an option or enter 99 to go back ");
            int option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Automatic Redial");
                    callSettings();
                    break;
                case 2:
                    System.out.println("Speed dialing");
                    callSettings();
                    break;
                case 3:
                    System.out.println("Call waiting options");
                    callSettings();
                    break;
                case 4:
                    System.out.println("Own number sending");
                    callSettings();
                    break;
                case 5:
                    System.out.println("Phone line in use");
                    callSettings();
                    break;
                case 6:
                    System.out.println("Automatic answer");
                    callSettings();
                    break;
                case 99:
                    settings();
                default:
                    mainMenu();
            }
        }

        public void toneSettings() {
            System.out.println("""
                                Tones
                                1: Ringing tone
                                2: Ringing volume
                                3: Incoming call alert
                                4: Composer
                                5: Message alert alone
                                6: Keypad tones
                                7: Warning and games tones
                                8: Vibrating alert
                                9: Screen saver
                                """);
            System.out.println("Pick an option or enter 99 to go back ");
            int option = input.nextInt();


            switch (option){
                case 1:
                    System.out.println("Ringing Tone");
                    toneSettings();
                    break;
                case 2:
                    System.out.println("Ringing Volume");
                    toneSettings();
                    break;
                case 3:
                    System.out.println("Incoming Call Alert");
                    toneSettings();
                    break;
                case 4:
                    System.out.println("Composer");
                    toneSettings();
                    break;
                case 5:
                    System.out.println("Message Alert Tone");
                    toneSettings();
                    break;
                case 6:
                    System.out.println("Keypad Tones");
                    toneSettings();
                    break;
                case 7:
                    System.out.println("Warning and game tones");
                    toneSettings();
                    break;
                case 8:
                    System.out.println("Vibrating Alert");
                    toneSettings();
                    break;
                case 9:
                    System.out.println("Screen saver");
                    toneSettings();
                    break;
                case 99:
                    mainMenu();
                    break;
            }
        }

        public void callRegister() {
            System.out.println("""
                                Call register
                                1: Missed calls
                                2: Received calls
                                3: Dialed numbers
                                4: Erase recent call lists
                                5: Call
                                6: show call costs
                                7: call cost settings
                                8: prepaid
                                """);
            System.out.println("Pick an option or enter 99 to go back ");
            int option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Missed calls");
                    callRegister();
                    break;
                case 2:
                    System.out.println("Received calls");
                    callRegister();
                    break;
                case 3:
                    System.out.println("Dialled calls");
                    callRegister();
                    break;
                case 4:
                    System.out.println("Erase recent call lists");
                    callRegister();
                    break;
                case 5:
                    showCallDurations();
                    callRegister();
                    break;
                case 6:
                    showCallCosts();
                    callRegister();
                    break;
                case  7:
                    callCostSettings();
                    callRegister();
                    break;
                case 8:
                    System.out.println("Prepaid credit");
                    callRegister();
                    break;
                case 99:
                    mainMenu();
                    break;
            }
        }

        public void callCostSettings() {
            System.out.println("""
                                            Call cost settings
                                            1: Call cost limit
                                            2: Show costs in""");
            System.out.println("Pick an option or enter 99 to go back ");
            int option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Call cost limit");
                    callCostSettings();
                    break;
                case 2:
                    System.out.println("Show costs in");
                    callCostSettings();
                    break;
                case 99:
                    callRegister();
                    break;
                default:
                    mainMenu();
                    break;
            }
        }

        public void showCallCosts() {
            System.out.println("""
                                            Show call costs
                                            1: Last call costs
                                            2: All calls cost
                                            3: Clear counters""");
            System.out.println("Pick an option or enter 99 to go back ");
            int option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Last call cost");
                    showCallCosts();
                    break;
                case 2:
                    System.out.println("All calls cost");
                    showCallCosts();
                    break;
                case 3:
                    System.out.println("Clear counters");
                    showCallCosts();
                    break;
                case 99:
                    callRegister();
                    break;
                default:
                    mainMenu();
                    break;
            }
        }

        public void showCallDurations() {
            System.out.println("Show call duration\n" +
                    "1: last call duration" +
                    "2: All calls duration" +
                    "3: Received calls duration" +
                    "4: Dialled calls duration" +
                    "5: Clear timers");
            System.out.println("Pick an option or enter 99 to go back ");
            int option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Last call duration");
                    showCallDurations();
                    break;
                case 2:
                    System.out.println("All calls duration");
                    showCallDurations();
                    break;
                case 3:
                    System.out.println("Received Calls' duration");
                    showCallDurations();
                    break;
                case 4:
                    System.out.println("Dialled calls' duration");
                    showCallDurations();
                    break;
                case 5:
                    System.out.println("Clear timers");
                    showCallDurations();
                    break;
                case 99:
                    callRegister();
                    break;
                default:
                    mainMenu();
                    break;
            }
        }

        public void Chat() {
            System.out.println("enter 99 to go back ");
            int option = input.nextInt();
            mainMenu();
        }

        void phoneBook() {
            System.out.println("""
                                PhoneBook
                                1: Search
                                2: Service nos
                                3: Add name
                                4: Erase
                                5: Edit
                                6: Assign tone
                                7: Send b'card
                                8: Options
                                9: Speed dials
                                10: Voice tags
                                11: back
                                """);
            System.out.println("Pick an option or enter 99 to go back ");
            int option = input.nextInt();


            switch (option){
                case 1:
                    System.out.println("Search your contacts");
                    phoneBook();
                    break;
                case 2:
                    System.out.println("Service Nos");
                    phoneBook();
                    break;
                case 3:
                    System.out.println("Add name");
                    phoneBook();
                    break;
                case 4:
                    System.out.println("Erase the contacts");
                    phoneBook();
                    break;
                case 5:
                    System.out.println("Edit Contact");
                    phoneBook();
                    break;
                case 6:
                    System.out.println("Assign Ringing Tone");
                    phoneBook();
                    break;
                case 7:
                    System.out.println("Send business card");
                    phoneBook();
                    break;
                case 8:
                    menu8();
                    break;
                case 9:
                    System.out.println("Set Your Speed dial");
                    phoneBook();
                    break;
                case 10:
                    System.out.println("Voice tags");
                    phoneBook();
                    break;
                case 99:
                    mainMenu();
                    break;
            }
        }

        public void menu8() {
            System.out.println("""
                                            Options
                                            1: Type of view
                                            2: Memory status
                                            """);
            System.out.println("pick an option or enter 99 to go back: ");
            int option =input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Type of view");
                    menu8();
                    break;
                case 2:
                    System.out.println("Memory status");
                    menu8();
                    break;
                case 99:
                    phoneBook();
                default:
                    mainMenu();
                    break;
            }
        }

        private void messages() {
            System.out.println("""
                                    Messages
                                    1: Write messages
                                    2: Inbox
                                    3: Outbox
                                    4: Picture Messages
                                    5: Templates
                                    6: Smileys
                                    7: Message settings
                                    8: Info service
                                    9: Voice Mailbox
                                    10: Service command editor""");
            System.out.println("Pick an option or enter 99 to go back ");
            int option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Write messages");
                    messages();
                    break;
                case 2:
                    System.out.println("Inbox");
                    messages();
                    break;
                case 3:
                    System.out.println("Outbox");
                    messages();
                    break;
                case 4:
                    System.out.println("Picture Messages");
                    messages();
                    break;
                case 5:
                    System.out.println("Templates");
                    messages();
                    break;
                case 6:
                    System.out.println("Smileys");
                    messages();
                    break;
                case 7:
                    messageSettings();
                    messages();
                    break;
                case 8:
                    System.out.println("Info Service");
                    messages();
                    break;
                case 9:
                    System.out.println("Voice Mailbox Number");
                    messages();
                    break;
                case 10:
                    System.out.println("Service command editor");
                    messages();
                    break;
                case 99:
                    mainMenu();
                    break;

            }
        }

        void messageSettings() {
            System.out.println("""
                                                messages settings:
                                                1: Set
                                                2: common""");
            System.out.println("pick an option or enter 99 to go back: ");
            int option =input.nextInt();

            switch (option){
                case 1:
                    menu1();
                    break;
                case 2:
                    menu2();
                    break;
                default:
                    mainMenu();
                    break;
            }
        }

        public void menu2() {
            System.out.println("""
                                                                Common:
                                                                1: Delivery Reports
                                                                2: Reply via same centre
                                                                3: Character support""");
            System.out.println("pick an option or enter 99 to go back: ");
            int option =input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Delivery Reports");
                    break;
                case 2:
                    System.out.println("Reply via same centre");
//                messageSettings();
                    break;
                case 3:
                    System.out.println("Character support");
//                messageSettings();
                    break;
                case 99:
                    messageSettings();
                    break;
                default:
                    mainMenu();
                    break;
            }
        }

        public void menu1() {
            System.out.println("""
                                                                Set:
                                                                1: Message centre number
                                                                2: Messages sent as
                                                                3: Message validity""");
            System.out.println("pick an option or enter 99 to go back: ");
            int option =input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Message Centre number");
//                messageSettings();
                    break;
                case 2:
                    System.out.println("Messages sent as");
//                messageSettings();
                    break;
                case 3:
                    System.out.println("Message Validity");
//                messageSettings();
                    break;
                case 99:
                    messageSettings();
                    break;
                default:
                    mainMenu();
                    break;
            }
        }

        public void switchOff() {
            System.out.println("Good bye see you next time");
        }
    }



