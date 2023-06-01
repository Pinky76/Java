package Student;
public class Student{
    public String name;

    public Student(){
        System.out.println("Default constructor is called");
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
}