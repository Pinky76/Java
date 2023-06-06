import java.util.Scanner;
public class Main {
    public static int reverseOfNum(int number){
        int reverse = 0;
        while(number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
    public static String checkAge(int age){
        if(age < 13){
            return "Kid";
        }
        else if(age >= 13 && age <= 19){
            return "Teen";
        }
        else{
            return "Adult";
        }
    }
    public static void FibonacciSeries(int n){
        int firstTerm = 0, secondTerm = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm+ " " );
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(" ");
    }
    public static void FizzTest(){
//        System.out.println(3%3);
//        System.out.println(5%3);
        for(int i =1 ; i <= 100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.print(" FizzBuzz ");
            }
            else if(i%3 == 0){
                System.out.print(" Fizz ");
            }
            else if(i%5 == 0){
                System.out.print(" Buzz ");
            }
            else{
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        System.out.println("Demo for Reverse Of a Number");
        System.out.println("Reversed of a number 12345 is "+ reverseOfNum(12345));
        System.out.println("reversed of a number 100 is "+ reverseOfNum(100));
        System.out.println("reversed of a number 000 is "+ reverseOfNum(000));

        System.out.println("Demo for IF and Else Block");
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Age:");
        int age = in.nextInt();
        String ageGroup = checkAge(age);
        System.out.println("Give Age is"+ age + " Age Group is "+ ageGroup);

        System.out.println("Demo for Fibonacci Series");
        System.out.println("Please Enter a Number:");
        int fNum = in.nextInt();
        System.out.println("Fibonacci Series for given number is" );
        FibonacciSeries(fNum);

        System.out.println("Demo for FIZZ Series");
        FizzTest();


    }
}