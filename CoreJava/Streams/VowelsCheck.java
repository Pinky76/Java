import java.util.Arrays;

public class VowelsCheck {
    public static void main(String[] args) {
        String[] strings = {"sun", "moon", "sky", "star"};

        Arrays.stream(strings)
                .filter(s -> s.chars().anyMatch(c -> isVowel((char) c)))
                .forEach(s -> System.out.println(s + " - " + countVowels(s)));
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    private static int countVowels(String s) {
        return (int) s.chars()
                .filter(c -> isVowel((char) c))
                .count();
    }
}