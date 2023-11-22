package java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Map<String, Double> subjectMarks = new HashMap<>();

        subjectMarks.put("Math", 85.5);
        subjectMarks.put("English", 78.0);
        subjectMarks.put("Science", 92.5);

        displayMarks(subjectMarks);

        inputMarks(subjectMarks);

        displayMarks(subjectMarks);
    }

    private static void displayMarks(Map<String, Double> subjectMarks) {
        System.out.println("Subject Codes and Marks:");
        for (Map.Entry<String, Double> entry : subjectMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }

    private static void inputMarks(Map<String, Double> subjectMarks) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter new marks for each subject code:");

        for (String subjectCode : subjectMarks.keySet()) {
            System.out.print(subjectCode + ": ");
            double newMark = scanner.nextDouble();

            if (newMark >= 0 && newMark <= 100) {
                subjectMarks.put(subjectCode, newMark);
                System.out.println("Mark updated successfully.");
            } else {
                System.out.println("Invalid mark! Mark remains unchanged.");
            }
        }

        scanner.close();
    }
}
