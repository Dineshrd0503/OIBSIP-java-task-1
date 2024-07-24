package examsy;

import java.util.*;

public class Home {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currentUser = null;
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Update Profile");
            System.out.println("3. Update Password");
            System.out.println("4. Start Exam");
            System.out.println("5. View Your History");
            System.out.println("5. Logout");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter username:");
                    String username = sc.nextLine();
                    System.out.println("Enter password:");
                    String password = sc.nextLine();
                    if (Login.authenticateUser(username, password)) {
                        currentUser = username;
                        System.out.println("Login successful.");
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                }
                case 2 -> {
                        System.out.println("enter your old username");
                        String username = sc.nextLine();
                        System.out.println("enter your old password");
                        String password = sc.nextLine();
                        if (Login.verify(username, password)) {
                            Profiles.updateProfiles(username, password);
                        }
                    else {
                        System.out.println("invalid credentials,Please login first.");
                    }
                }
                case 3 -> {
                        System.out.println("enter your old username");
                        String username = sc.nextLine();
                        System.out.println("enter your old password");
                        String password = sc.nextLine();
                        if (Login.verify(username, password)) {
                            System.out.println("now you cna chnage your credentails");
                            Profiles.updatePassword(username, password);
                        } else {
                            System.out.println("invalid creddentials,Please login first.");
                        }
                }
                case 4 -> {
            
                        System.out.println("enter your username");
                        String username = sc.nextLine();
                        System.out.println("enter your password");
                        String password = sc.nextLine();
                        if (Login.verify(username, password)) {
                            System.out.println("Enter exam duration in minutes:");
                            int duration = sc.nextInt();
                            sc.nextLine(); // Consume newline
                            ExamDuration.startTimer(duration);
                            ExamsAdmin.startExam(currentUser, password);
                            ExamDuration.stopTimer();
                        }
                    else {
                        System.out.println("invalid credenetials");
                        System.out.println("Please login first.");
                    }
                }
    
                case 5 -> {
                    System.out.println("enter your usernmae");
                    String username = sc.nextLine();
                    System.out.println("enter your password");
                    String password = sc.nextLine();
                    if (Login.verify(username, password)) {
                        Profiles.displayhistory(username, password);
                    } else {
                        System.out.println("Please login first.");
                    }
                }
                case 6 -> {
                        System.out.println("enter your usernmae");
                        String username = sc.nextLine();
                        System.out.println("enter your password");
                        String password = sc.nextLine();
                        if (Login.verify(username, password));
                        UserDetails.userdetails.clear();
                        System.out.println("Logged out successfully.");

                    }

                case 0 -> {
                    System.out.println("Exiting the system.");
                    sc.close();
                    return;
                }
                default ->
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
