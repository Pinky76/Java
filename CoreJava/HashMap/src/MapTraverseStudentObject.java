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
public class MapTraverseStudentObject {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        Student s1 = new Student("Manasa","Manthena", 4.0);
        Student s2 = new Student("Sai","Manthena", 3.75);
        Student s3 = new Student("Krithik","Rayabarapu", 3.75);
        Student s4 = new Student("Arjun","Rayabarapu", 3.3);
        map.put("Manasa",s1);
        map.put("Sai",s2);
        map.put("Krithik",s3);
        map.put("Arjun",s4);
        System.out.println("Printing Maps using Entry Set");
        for(HashMap.Entry<String,Student> set : map.entrySet()){
            System.out.println("Key is :: "+ set.getKey());
            System.out.println("Object is :: "+ set.getValue());
        }
        System.out.println("");
        System.out.println("Printing Maps using For Each Method");
        for(Student s : map.values()){
            System.out.println("Student is :: "+ s);
        }
        System.out.println("");
        System.out.println("Printing Maps using Iterator");

        Iterator<String> itr = map.keySet().iterator();
        while (itr.hasNext())
        {
            String key = itr.next();
            Student value = map.get(key);
            System.out.println("Key is :: " + key  +"Value is :: " + value);
        }
    }
}
