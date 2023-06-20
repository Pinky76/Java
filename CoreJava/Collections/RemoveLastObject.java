import java.util.ArrayList;
import java.util.List;

public class RemoveLastObject {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sun");
        list.add("Moon");
        list.add("Sky");
        list.add("Planet");

        System.out.println("Given ArrayList is: " + list);

        list.remove(list.size() - 1);

        System.out.println("Updated ArrayList is: " + list);
    }
}