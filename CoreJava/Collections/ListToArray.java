import java.util.*;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sam");
        list.add("Mike");
        list.add("Paul");
        if (list instanceof List) {
            System.out.println("List a list Object"+ list);
        }
        String[] array = list.toArray(String[]::new);
        if (array.getClass().isArray()) {
            System.out.println("It is a Array of Strings");
            Arrays.stream(array)
                    .forEach(element -> System.out.println(element));
        }
    }
}