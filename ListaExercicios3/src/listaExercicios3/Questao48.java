package listaExercicios3;

import java.util.Locale;
import java.util.Scanner;

public class Questao48 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int nGrades = sc.nextInt();

        double totalGrades = 0;
        int totalAbsences = 0;

        for (int i = 1; i <= nGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = sc.nextDouble();
            totalGrades += grade;
        }

        System.out.print("Enter the total number of absences in the semester: ");
        int totalAbsencesSemester = sc.nextInt();

        int totalClasses = 100; // Assuming the total number of classes in the semester is 100

        double average = totalGrades / nGrades;
        double absencePercentage = (double) totalAbsencesSemester / totalClasses * 100;

        if (average >= 7.0) {
            System.out.println("Student Approved!");
        } else if (average >= 3.0) {
            double examGrade = 10 - average; // Minimum grade to take the final exam is 3.0
            double recoveryAverage = (average + examGrade) / 2;
            if (recoveryAverage >= 5.0) {
                System.out.println("Student Approved in the Exam!");
            } else {
                System.out.println("Student Failed by Grade!");
            }
        } else {
            System.out.println("Student Failed by Grade!");
        }

        if (absencePercentage > 25) {
            System.out.println("Student Failed due to Absences!");
        }

        System.out.println("Student's Average: " + average);
        System.out.println("Percentage of Absences: " + absencePercentage + "%");

        sc.close();
    }
}
