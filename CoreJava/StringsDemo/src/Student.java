public class Student implements Comparable<Student>{
    private String fName;
    private String lName;
    private double gpa;
    public Student(String fName, String lName, double gpa){
        this.fName = fName;
        this.lName = lName;
        this.gpa = gpa;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String toString() {
        return fName + "\t" + lName + "\t" + gpa ;
    }
    @Override
    public int compareTo(Student obj){
        Student student=(Student)obj;
        return (this.lName).compareTo(student.lName);
    }
}