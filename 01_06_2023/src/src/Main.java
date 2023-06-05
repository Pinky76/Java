import java.security.PrivilegedAction;

public class Main {
    public static void main(String[] args) {
//      Abstraction Implementation
        System.out.println("Inside Main Class");
        DepartmentImplementation dep = new DepartmentImplementation();
        String[] departments = {"CSE","IT","CIVIL","MECH"};
        System.out.println("Department size is "+ dep.getDepartmenSize(departments));
        //      Overloading
        Product p = new Product();
        p.setPrice(5);
        System.out.println("Integer Overload method"+ p.getPrice(5));
        p.setPrice(10.66);
        System.out.println("Double Overload method"+ p.getPrice(10.66));

        // Overriding
        Parent1 p1 = new Parent1();
        p1.parent();
        Parent2 p2 = new Parent2();
        p2.parent();
    }
}