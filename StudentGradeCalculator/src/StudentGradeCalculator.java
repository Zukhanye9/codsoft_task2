import java.util.Scanner;

public class StudentGradeCalculator {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Input marks obtained in each subject
    System.out.println("Enter the number of subjects:");
    int numberOfSubjects = scanner.nextInt();
    int[] marks = new int[numberOfSubjects];

    System.out.println("Enter the marks obtained in each subject out of 100:");
    for (int i = 0; i < numberOfSubjects; i++) {
        System.out.print("Subject " + (i + 1) + ": ");
        marks[i] = scanner.nextInt();
    }

    //Calculate Total Marks
    int totalMarks = 0;
    for (int mark : marks) {
        totalMarks += mark;
    }

    //Calculate Average Percentage
    double averagePercentage = (double) totalMarks / numberOfSubjects;

    //Grade Calculation
    char grade;
    if (averagePercentage >= 90) {
        grade = 'A';
    } else if (averagePercentage >= 80) {
        grade = 'B';
    }else if (averagePercentage >= 70) {
        grade = 'C';
    }else if (averagePercentage >= 60) {
        grade = 'D';
    }else {
        grade = 'F';
    }

    //Display Results
    System.out.println("\nResults:");
    System.out.println("Total Marks: " + totalMarks);
    System.out.println("Average Percentage: " + averagePercentage);
    System.out.println("Grade: " + grade);

    scanner.close();
   }
}
