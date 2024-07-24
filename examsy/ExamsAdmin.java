package examsy;

import java.util.*;

public class ExamsAdmin {
    public static Scanner sc = new Scanner(System.in);
    public static List<String> questions = new ArrayList<>();
    public static List<String> answers = new ArrayList<>();
    public static List<String> finalanswers = Arrays.asList("india", "vikram sarabhai", "729");
    private static int score = 0;

    public static void main(String[] args) {
        OUTER:
        while (true) {
            System.out.println("Press 1 to go for exam and 0 to exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 0 -> {
                    System.out.println("Thank you for visiting");
                    break OUTER;
                }
                case 1 -> startExam("username", "password");
                default -> {
                    System.out.println("Invalid choice");
                    sc.next();
                }
            }
        }
    }

    public static void startExam(String username, String password) {
        System.out.println("Welcome user: " + username);
        System.out.println("Starting the exam");
        answers.clear();
        score = 0;
        System.out.println("There are 3 one word answer questions");
        System.out.println("Each question carries 5 marks");
        System.out.println("-0 marks are deducted for wrong answers");

        System.out.println("Complete the exam within the given time limit");

        questions.add("What is the capital of India");
        questions.add("Who is the father of Indian rocket technology");
        questions.add("What is the cube of 9");

        for (String question : questions) {
            System.out.println(question);
            String answer = sc.nextLine();
            answers.add(answer);
        }

        submitExam();
    }

    public static void submitExam() {
        System.out.println("Your exam has been submitted");
        System.out.println("Displaying your answers");

        for (int i = 0; i < answers.size(); i++) {
            System.out.println(answers.get(i) + " for question " + questions.get(i));
        }

        checkScore(answers, finalanswers);
    }

    public static void checkScore(List<String> answers, List<String> finalanswers) {
        if (answers.size() != finalanswers.size()) {
            System.out.println("You have entered more answers than expected");
            return;
        }

        for (int i = 0; i < finalanswers.size(); i++) {
            if (answers.get(i).equalsIgnoreCase(finalanswers.get(i))) {
                score += 5;
            }
        }
        System.out.println("Your score is: " + score);
    }
}