import java.util.Arrays;
import java.util.Comparator;

public class StringCapitalization {
    public static void main(String[] args) {
        String[] strings = {"apricot", "banana", "camel", "duck"};

        // Capitalize the first letter of each string
        String[] capitalizedStrings = Arrays.stream(strings)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .toArray(String[]::new);

        // Sort the capitalized strings in alphabetical order
        Arrays.sort(capitalizedStrings);

        // Print the sorted strings
        Arrays.stream(capitalizedStrings).forEach(System.out::println);
    }
}
