package Diary;

import java.util.Scanner;

public class Main {
       private static Scanner keyboardInput =new Scanner(System.in);
    private static Diary diary;
    public static void main(String[] args) {
        createDiary();
        displayLockMenu();

    }

    private static void createDiary() {
        String mainMain = """
                Welcome to my Diary!!!
                Let's set it up
                """;
        print(mainMain);
        String username = input("Enter your name");
        String password = input("Enter your password");
        diary = new Diary(username, password);
        print("Diary created for"+ username);
    }

    private static void displayLockMenu(){
        String mainMain = """
                press
                1 -> unlock Diary
                2 -> Lock Diary
                3 -> exit
                """;
        String userInput = input(mainMain);
        switch (Integer.parseInt(userInput)) {
            case 1 -> unlockDiary();
            case 2 -> lockDiary(); // todo
            case 3 -> exitApplication();
        }
    }

    private static void exitApplication() {
        print("Thanks for using our application");
        System.exit(0);
    }

    private static void lockDiary() {
        diary.Lock();
        print("Locked successfully");
        displayLockMenu();
    }

    private static void unlockDiary() {
        String password = input("Enter correct password");
        diary.unlockWith(password);
        if (diary.isLocked()) {print("Wrong password");displayLockMenu();}
        displayDiaryMenu();
    }

    private static void displayDiaryMenu() {
        String diaryMenu = """
                Press 1 -> Create Entry
                Press 2 -> Find Entry by Id
                Press 3 -> Get total number of entries
                Press 4 -> lock diary
                """;
        String userInput = input(diaryMenu);
        switch (Integer.parseInt(userInput)){
            case 1: createEntry();
            case 2 : findById();
            case 3: getTotalNumberOfEntries();
            case 4: lockDiary();
        }

    }

    private static void getTotalNumberOfEntries() {
        int totalNumberOfEntry = diary.numberOfEntries();
        print("You have " + totalNumberOfEntry + "Entries");
        displayDiaryMenu();
    }

    private static void findById() {
        String Id = input("Enter the Id for the entry you want to find");
        Entry foundEntry = diary.findEntryWithId(Integer.parseInt(Id));
        print(foundEntry.toString());
        displayDiaryMenu();
    }

    private static void createEntry() {
        String title = input("Enter title for the entry");
        String body = input("Enter body for the entry");
        diary.write(title, body);
        print("Written successfully");
        displayDiaryMenu();
    }

    private static String input(String prompt){
        print(prompt);
        return keyboardInput.nextLine();
    }
    private static void print(String prompt){
        System.out.println(prompt);
    }
}

