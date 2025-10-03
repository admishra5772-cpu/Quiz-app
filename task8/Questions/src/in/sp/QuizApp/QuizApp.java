package in.sp.QuizApp;


import java.util.*;

class Question {
    String question;
    String[] options;
    int correctAnswer;

    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of India?",
                new String[]{"1. Delhi", "2. Mumbai", "3. Kolkata", "4. Chennai"}, 1));
        questions.add(new Question("Which company developed Java?",
                new String[]{"1. Google", "2. Microsoft", "3. Sun Microsystems", "4. Oracle"}, 3));
        questions.add(new Question("Which keyword is used to inherit a class in Java?",
                new String[]{"1. implement", "2. extends", "3. inherits", "4. super"}, 2));
        questions.add(new Question("Which collection does not allow duplicates?",
                new String[]{"1. List", "2. Set", "3. Map", "4. ArrayList"}, 2));

        int score = 0;

        System.out.println("===== Welcome to Java Quiz =====");
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.question);
            for (String option : q.options) {
                System.out.println(option);
            }
            System.out.print("Your answer (1-4): ");
            int ans = sc.nextInt();

            if (ans == q.correctAnswer) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.correctAnswer);
            }
        }

        System.out.println("\n===== Quiz Finished =====");
        System.out.println("Your Score: " + score + "/" + questions.size());
    }
}
