package com.dest.project.p1;
import java.util.Scanner;
public class SimpleQuiz{
    private static final int MAX_ATTEMPTS = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // Questions and options
        String[] questions = {
            "How many loops are there in java?",
            "Which method is the entry point of a Java application?",
            "What are the important segment in java?",
            "Which keyword is used to inherit a class in Java?",
            "What is the size of an int in Java?",
            "Which of the following is used to create an object in Java?",
            "What is the default value of a boolean variable in Java?",
            "Which keyword is used to define a class in Java?",
            "Which package is imported by default in every Java program?",
            "What does JVM stand for?"
        };
        String[][] options = {
            {"3", "2", "1", "4"},
            {"main", "start", "init", "run"},
            {"Static block","Static method","Static Variable","All of the above"},
            {"super", "extends", "implements", "inherits"},
            {"4 bytes", "8 bytes", "2 bytes", "1 byte"},
            {"class", "new", "create", "instantiate"},
            {"true", "false", "null", "0"},
            {"class", "interface", "void", "main"},
            {"java.lang", "java.util", "java.io", "java.net"},
            {"Java Virtual Machine", "Java Visual Machine", "Just Virtual Machine", "Just Visual Machine"}
        };
        int[] answers = {0, 0, 3, 1, 0, 1, 1, 0, 0, 0};
        int score = 0;
        int lifelines = 2; // Only 2 life lines: 50-50 and Audience Poll
        int attempts = MAX_ATTEMPTS;
        boolean lifelineOffered = false; // Flag to track if life lines have been offered
        // Start the quiz
        for (int i = 0; i < questions.length; i++) {
            if (attempts <= 0) {
                System.out.println("No attempts left. Game over.");
                break;
            }
            System.out.println((i + 1) + ". " + questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }
            if (attempts == 1 && !lifelineOffered && lifelines > 0) {     // Offer life line after last attempt
                System.out.println("You have 1 attempt left. Do you want to use a lifeline?");
                System.out.println("1. 50-50");
                System.out.println("2. Audience Poll");
                System.out.println("3. No");
                int lifelineChoice = scanner.nextInt(); 
                if (lifelineChoice == 1) {
                    use5050Lifeline(options[i], answers[i]);
                    lifelines--;
                } else if (lifelineChoice == 2) {
                    useAudiencePollLifeline(options[i], answers[i]);
                    lifelines--;
                }
                lifelineOffered = true; // Mark life line as used
            }
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt() - 1;

            if (userAnswer == answers[i]) {
                score++;
                System.out.println("Correct Answer! Your score is: " + score);
            } else {
                attempts--;
                System.out.println("Wrong Answer! Remaining attempts: " + attempts);
                if (attempts == 0) {
                    System.out.println("No attempts left. Game over.");
                    break;
                }
            }
        }
        System.out.println("Quiz finished! Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }
    private static void use5050Lifeline(String[] options, int correctAnswerIndex) {
        int incorrectOptionIndex;
        do {
            incorrectOptionIndex = (int) (Math.random() * options.length);
        } while (incorrectOptionIndex == correctAnswerIndex);

        System.out.println("50-50 Lifeline used. Here are your remaining options:");
        System.out.println("1. " + options[correctAnswerIndex]);
        System.out.println("2. " + options[incorrectOptionIndex]);
    }
    private static void useAudiencePollLifeline(String[] options, int correctAnswerIndex) {
        // Simulate audience poll: 50% chance for the correct answer and 50% for incorrect answers
        int[] pollResults = new int[options.length];
        for (int i = 0; i < pollResults.length; i++) {
            pollResults[i] = (i == correctAnswerIndex) ? (int) (Math.random() * 50 + 50) : (int) (Math.random() * 50);
        }
        System.out.println("Audience Poll Lifeline used. Here are the results:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i] + " - " + pollResults[i] + "% of the audience thinks this is correct.");
        }
    }
}