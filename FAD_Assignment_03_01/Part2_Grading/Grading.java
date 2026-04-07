package Part2_Grading;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score (0 - 100): ");
        int score = input.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid Score!");
        } else if (score <= 40) {
            System.out.println("Grade: Insufficient");
        } else if (score <= 60) {
            System.out.println("Grade: Poor");
        } else if (score <= 80) {
            System.out.println("Grade: Average");
        } else if (score <= 90) {
            System.out.println("Grade: Good");
        } else {
            System.out.println("Grade: Excellent");
        }

        input.close();
    }
}
