import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter the number of weeks: ");
        int numWeeks = scanner.nextInt();

        String[] students = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            students[i] = scanner.next();
        }

        int[][] scores = inputScore(students, numWeeks);
        displayStudent(students, scores, numWeeks);
        weekWithHighestScore(scores, numWeeks);
        studentWithHighestGrade(students, scores, numWeeks);

    }

    public static int[][] inputScore(String[] students, int numWeeks) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[students.length][numWeeks];

        System.out.println("Input student scores:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter scores for " + students[i] + ":");
            for (int j = 0; j < numWeeks; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                scores[i][j] = scanner.nextInt();
            }
        }
        return scores;
    }

    public static void displayStudent(String[] students, int[][] scores, int numWeeks) {
        System.out.println("Student Score Data:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ":");
            for (int j = 0; j < numWeeks; j++) {
                System.out.println("Week " + (j + 1) + ": " + scores[i][j]);
            }
            System.out.println();
        }
    }

    public static void weekWithHighestScore(int[][] scores, int numWeeks) {
        int highScore = 0;
        int highWeek = 0;

        for (int week = 0; week < numWeeks; week++) {
            int totalScore = 0;

            for (int student = 0; student < scores.length; student++) {
                totalScore += scores[student][week];
            }

            if (totalScore > highScore) {
                highScore = totalScore;
                highWeek = week + 1;
            }
        }

        System.out.println("Week with the highest total score: Week " + highWeek + " (Total score: " + highScore + ")");
    }

    public static void studentWithHighestGrade(String[] students, int[][] scores, int numWeeks) {
        int highestScore = 0;
        int highestStudent = 0;

        for (int i = 0; i < students.length; i++) {
            int totalScore = 0;
            for (int j = 0; j < numWeeks; j++) {
                totalScore += scores[i][j];
            }

            if (totalScore > highestScore) {
                highestScore = totalScore;
                highestStudent = i;
            }
        }

        System.out.println("\nStudent with the highest total score:");
        System.out.println("Name: " + students[highestStudent]);
        System.out.println("Total Score: " + highestScore);
        for (int j = 0; j < numWeeks; j++) {
            System.out.println("Week " + (j + 1) + ": " + scores[highestStudent][j]);
        }
    }
}
