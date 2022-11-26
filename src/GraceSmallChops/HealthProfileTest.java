package GraceSmallChops;

import GraceSmallChops.HealthProfile;

import java.util.Scanner;

class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

HealthProfile patientProfile = new HealthProfile("Jackson","Whitwiker", "Male",5, 13, 1996, 69, 163 );

        System.out.print("Enter your first name: ");
        String name = input.nextLine();
        patientProfile.setFirstname(name);

        System.out.println();

        System.out.print("Enter your last name: ");
        String surname = input.nextLine();
        patientProfile.setLastname(surname);

        System.out.println();

        System.out.print("Enter your gender: ");
        String gender = input.nextLine();
        patientProfile.setGender(gender);

        System.out.println();

        System.out.print("Enter your year of birth: ");
        int year = input.nextInt();
        patientProfile.setYear(year);

        System.out.println();

        System.out.print("Enter your month of birth: ");
        int month = input.nextInt();
        patientProfile.setMonth(month);

        System.out.println();

        System.out.println("Enter your day of birth");
        int day = input.nextInt();
        patientProfile.setDay(day);

        System.out.println();

        System.out.println("Enter your height");
        int height = input.nextInt();
        patientProfile.setHeight(height);

        System.out.println();

        System.out.println("Enter your weight");
        int weight = input.nextInt();
        patientProfile.setWeight(weight);

        System.out.println();

        Displaydetails(patientProfile);


    }

    private static void Displaydetails(HealthProfile patientProfile) {
        System.out.printf("Patient first name is: %s", patientProfile.getFirstname());
        System.out.println();
        System.out.printf("Patient last name is: %s", patientProfile.getLastname());
        System.out.println();
        System.out.printf("Patient is a: %s", patientProfile.getGender());
        System.out.println();
        System.out.printf("patient is %d years old",patientProfile.getAge());
        System.out.println();
        System.out.printf("Patient weighs %d kg",patientProfile.getWeight());
        System.out.println();
        System.out.printf("Patient is %d cm tall", patientProfile.getHeight());
        System.out.println();
        patientProfile.getTargetHeartRate();
    }

}