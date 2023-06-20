import java.util.Arrays;
public class AverageOfSquare {
    public static void main(String[] args) {
        Integer[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25};

        double average = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n * n)
                .average()
                .orElse(0);

        System.out.println("Average of squares of odd numbers: " + average);
    }
}
