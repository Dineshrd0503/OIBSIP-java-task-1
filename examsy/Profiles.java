package examsy;

import java.util.*; // Import Scanner class

public class Profiles {
    public static Scanner sc = new Scanner(System.in);

    public static void updateProfiles(String username, String password) {
        System.out.println("enter new username");
        String newusername = sc.nextLine();
        System.out.println("enter new password");
        String newpassword = sc.nextLine();
        UserDetails.userdetails.put(newusername, newpassword);
        System.out.println("profile updated");
    }

    public static void updatePassword(String username, String password) {
        // Declare Scanner object
        System.out.println("enter new password");
        String newpassword = sc.nextLine();
      UserDetails.userdetails.put(username,newpassword);
        System.out.println("password updated");
    }

    public static void displayhistory(String username, String password) {
        System.out.println("Displaying history of usernames and passwords:");
        if (!UserDetails.userdetails.isEmpty()) {
            for (Map.Entry<String, String> entry : UserDetails.userdetails.entrySet()) {
                String newusername = entry.getKey();
                String newpassword = entry.getValue();
                System.out.println("Username: " + newusername + ", Password: " + newpassword);
            }
        } else {
            System.out.println("No history found");
        }

    }
}
