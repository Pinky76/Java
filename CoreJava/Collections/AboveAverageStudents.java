import java.util.*;
class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return  firstName  + " " +
                lastName + " - " +
                gpa;
    }
}
public class AboveAverageStudents {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sam", "Mike", 3.7));
        studentList.add(new Student("John", "Tyson", 4.0));
        studentList.add(new Student("Sia", "Richardson", 3.3));
        studentList.add(new Student("Matt", "Paul", 3.8));

        System.out.println("Given Student list is:");
        System.out.println(studentList);

        double averageGpa = studentList.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);

        studentList.removeIf(student -> student.getGpa() < averageGpa);

        System.out.println("Updated student list:");
        System.out.println(studentList);
    }
}