import java.util.*;
import java.io.*;
public class IOImplementation {

    public static void main(String[] args) throws FileNotFoundException{
        String csvFile = "Student.csv";
        String line;
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(new FileReader(csvFile));
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] data = line.split(",");
            String firstName = data[0];
            String lastName = data[1];
            double gpa = Double.parseDouble(data[2]);
            Student student = new Student(firstName, lastName, gpa);
            students.add(student);
        }
       Collections.sort(students);
        System.out.println("FirstName: LastName: GPA");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}