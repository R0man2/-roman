
package org.example;
import javax.xml.stream.Location;
import java.util.Scanner;
import java.util.ArrayList;
public class Admin {
    static Scanner sca = new Scanner(System.in);

    public static ArrayList<String> locations = new ArrayList<>();
    public static ArrayList<String> climate = new ArrayList<>();
    public static ArrayList<String> Risks = new ArrayList<>();
    public static ArrayList<String> Pmeasures = new ArrayList<>();

    public static void admin(String username) {
        System.out.println("=========================================================");
        System.out.println("Enter 1 to Add Location");
        System.out.println("Enter 2 to View Location");
        System.out.println("Enter 3 to Delete Location");
        System.out.println("Enter 4 to Logout");
        System.out.println("Enter 5 to Exit");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Enter number between 1 to 5");
        int selectedNumber = sca.nextInt();
        sca.nextLine();
        if (selectedNumber == 1) {
            addLocation();
        } else if (selectedNumber == 2) {
            System.out.println("=========");
            System.out.println("locations: ");
            viewLocation();
        } else if (selectedNumber == 3) {
            deleteLocation();
        } else if (selectedNumber == 4) {
            Login.userLogin();
        } else if (selectedNumber == 5) {
            System.out.println("Stay cool and keep the planet greener! Catch you later" +
                    ", eco-warrior. Don't forget to stay updated for more climate tips!");
            System.exit(0);
        }

    }

    public static void addLocation() {
        System.out.println("Enter the number of locations to be added");
        int numberOfLocations = sca.nextInt();
        sca.nextLine(); // Consume newline

        for (int i = 1; i <= numberOfLocations; i++) {
            System.out.println("Enter location " + i);
            String locationName = sca.nextLine();

            System.out.println("Enter climatic information of " + locationName);
            String climateInfo = sca.nextLine();

            System.out.println("Enter risks due to climate of " + locationName);
            String risk = sca.nextLine();
            System.out.println("Enter preventive measures for climate of " + locationName);
            String measures = sca.nextLine();

            locations.add(locationName);
            climate.add(climateInfo);
            Pmeasures.add(measures);
            Risks.add(risk);

            System.out.println("Location added successfully!");
            System.out.println("========================================================================");
        }

        admin("");
    }

    public static void viewLocation() {
        for (String location : locations) {
            System.out.println(location);
            if (locations.isEmpty()) {
                System.out.println("This location is not added");
            }
            System.out.println("========================================================================");
        }

//        return  viewLocation();
        admin("");


    }

    public static void deleteLocation() {
        System.out.println("====================================================================");
        System.out.println("Location");
        System.out.println("================================================================");
        for (String location : locations) {
            System.out.println(location);
        }
        System.out.println("Enter the location to delete");
        String toDelete = sca.next();
        locations.remove(toDelete);
        admin("");
    }
    public static void news(){
        System.out.println(" Headline| Climate Scientists Warn of Accelerating Global Warming: \n" + "Amid growing concerns, climate scientists emphasize the urgency of addressing accelerating global warming. Recent data reveals unprecedented temperature rises, triggering extreme weather events worldwide. Experts call for immediate action to curb greenhouse gas emissions and mitigate the impacts of climate change.");
        System.out.println("===========================================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.println("Headline| Climate-Driven Disasters Devastate Communities Worldwide: \n" + "Climate change-induced disasters wreak havoc globally as extreme weather events intensify. From devastating floods to unprecedented wildfires, communities face escalating risks exacerbated by rising temperatures. Urgent calls for resilient infrastructure and comprehensive climate adaptation strategies emerge as nations grapple with the escalating impacts of climate-driven disasters.");
        System.out.println("===========================================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.println("Headline| Coastal Cities Grapple with Rising Sea Levels: \n"+ "Coastal cities worldwide confront the relentless rise of sea levels, driven by climate change. Recent studies highlight the vulnerability of urban centers to inundation, prompting urgent calls for robust coastal defenses and sustainable adaptation measures. As sea levels continue to climb, cities face a race against time to safeguard infrastructure and protect vulnerable communities from the escalating threat of coastal flooding." );
        System.out.println("===========================================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.println("Headline| Arctic Ice Loss Accelerates, Signaling Climate Crisis: \n"+"Scientists report alarming rates of Arctic ice loss, marking a critical tipping point in the Earth's climate system. Rapid melting of polar ice caps threatens biodiversity, accelerates sea level rise, and amplifies global warming. Urgent international cooperation is imperative to mitigate the far-reaching consequences of Arctic ice decline and safeguard the planet's fragile ecosystems.");
        System.out.println("===========================================================================================================================================================================================================================================================================================================================================================================================================");

    }


}








