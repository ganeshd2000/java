package java;

class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;

        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade! Setting default grade to 0.0");
            this.grade = 0.0;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Invalid grade! Grade remains unchanged.");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student student = new Student("John", 20, 85.5);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());

        student.setGrade(110);

        student.setGrade(92.5);

        System.out.println("Updated Grade: " + student.getGrade());
    }
}
