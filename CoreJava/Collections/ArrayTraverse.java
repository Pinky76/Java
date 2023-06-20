import java.util.*;
public class ArrayTraverse {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("Hey");

        System.out.println("For Loop Demo:");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
        System.out.println();

        System.out.println("Enhance For Loop Demo:");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println();

        System.out.println("Iterator Demo:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println();

        System.out.println("For each Demo:");
        list.forEach(str -> System.out.println(str));
        System.out.println();

        System.out.println("Parallel Stream Demo:");
        list.parallelStream().forEach(str -> System.out.println(str));
    }
}