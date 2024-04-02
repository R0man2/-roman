package org.example;
import java.util.Scanner;

public class GeneralUser {
    static Scanner scan = new Scanner(System.in);

    public static void normal(String username) {

        System.out.println("==============================================================================");
        System.out.println("Choose a number");
        System.out.println("1: View locations");
        System.out.println("2: Enter your location and know the climatic condition of your place");
        System.out.println("3: News on Climate change");
        System.out.println("4: Play Quiz");
        System.out.println("5: Logout");
        System.out.println("6: Exit");

        int num = scan.nextInt();
        scan.nextLine();

        if (num == 1) {
            for (String location : Admin.locations) {
                System.out.println(location);
            }
            if (Admin.locations.isEmpty()) {
                System.out.println("No locations are added");
            }
            normal("");
        } else if (num == 2) {
            System.out.println("Enter your location");
            String location = scan.next();

            if (Admin.locations.contains(location)) {
                for (int i = 0; i < Admin.locations.size(); i++) {
                    if (Admin.locations.get(i).equals(location)) {
                        String locationName = Admin.locations.get(i);
                        String climateCondition = Admin.climate.get(i);
                        String risk = Admin.Risks.get(i);
                        String preventiveMeasure = Admin.Pmeasures.get(i);

                        System.out.println("Climatic condition of " + locationName + " respectively: " + climateCondition);
                        System.out.println("Risks due to climatic condition of " + locationName + " respectively: " + risk);
                        System.out.println("Preventive measure of risks due to climate of  " + locationName + " respectively: " + preventiveMeasure);

                        break;
                    }
                }
            } else {
                System.out.println("Location not found");
            }
            normal("");
        } else if (num == 3) {
            Admin.news();
            normal("");
        } else if (num == 4) {
            // Quiz logic here
            normal("");
        } else if (num == 5) {
            Login.userLogin();
        } else if (num == 6) {
            System.out.println("Thank you for participating and learning about climate change.");
            System.out.println("Remember, every action counts in protecting our planet!");
            System.out.println("Stay cool and keep the planet greener! Catch you later, eco-warrior. Don't forget to stay updated for more climate tips!");
            System.out.println("Ba-bye for now!🌱✨");
            System.exit(0); /
        }
    }
}
