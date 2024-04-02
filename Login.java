package org.example;

import java.util.Scanner;


public class Login {
    static Scanner sc = new Scanner(System.in);
    public static void  userLogin() {
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Username: " + username);
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        System.out.println("Email: " + email);

        String x = username + "@user.com";
        String y = username + "@admin.com";

        if (email.equals(x)) {

            System.out.println("====================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
            System.out.println("WELCOME " + username.toUpperCase()  +" \uD83C\uDF0D\n");
            System.out.println("As you step into our eco-conscious community, you're not just" +
                    " logging in; you're joining a movement towards a greener, " +
                    "more sustainable world. " );
            System.out.println( "Your commitment to climate action is the beacon guiding our collective " +
                    "journey towards a brighter future.\n");
            System.out.println(
                    "Together, we'll explore innovative ways to reduce carbon footprints, " +
                            "champion renewable energy, and foster environmental stewardship. " +
                            "Every click, every interaction here is a step closer to a planet that " +
                            "thrives for generations to come.\n");
            System.out.println(  "So, take a moment to breathe in the fresh air of possibility. " +
                    "You're not just a user; you're an advocate, a changemaker, and a catalyst" +
                    " for positive change. Let's embark on this adventure together and " +
                    "make every action count!\n" +
                    "\n" +
                    "Welcome to the forefront of climate action! \uD83C\uDF31\uD83C\uDF1F");
            GeneralUser.normal(username);

        }
        else if (email.equals(y)) {

            System.out.println("Welcome Admin! ");
            Admin.admin(username);

        }
        else {
            System.out.println("Invalid email");
            userLogin();
        }



    }
}


