import java.util.Scanner;

public class GradeCalculator {

    // Method to get the student's score
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1;

        // Loop to validate the input (ensuring the score is a valid number)
        while (score < 0) {
            System.out.print("Enter your score: ");
            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                if (score < 0) {
                    System.out.println("Score cannot be negative. Please enter a valid score.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input
            }
        }
        return score;
    }

    // Method to calculate the letter grade based on the score
    public static String calculateGrade(double score) {
        // Determine the letter grade using conditional statements
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        // Call getStudentScore() method to get the user's score
        double score = getStudentScore();
        
        // Call calculateGrade() method to calculate the grade
        String grade = calculateGrade(score);
        
        // Display the result
        System.out.println("Your Grade is: " + grade);
    }
}
