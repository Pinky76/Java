
public class DepartmentImplementation extends Department{

    @Override
    public int getDepartmenSize(String[] departments) {
        System.out.println("Inside Department Abstract method implementation");
//        System.out.println("Department size is"+ departments.length);
        return departments.length;
    }
}
