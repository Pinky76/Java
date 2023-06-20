import java.util.Arrays;
import java.util.Comparator;
public class ConditionalSorting {
    public static void main(String[] args) {
        String[] strings = {"sun", "soon", "moon", "music", "place"};

        Arrays.stream(strings)
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed()))
                .forEach(System.out::println);
    }
}
