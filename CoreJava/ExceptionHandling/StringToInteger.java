import java.util.Scanner;
public class StringToInteger {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("please enter a String:");
        try {
            int a = Integer.parseInt(myObj.nextLine());
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("NumberFormat Exception: invalid input string"+e);
        }
    }
}
