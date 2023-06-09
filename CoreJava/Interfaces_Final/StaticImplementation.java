public class StaticImplementation {
    static int test ;
    public static int runTestStatic(int x){
        test = x;
        return test;
    }

    static {
        test = 10;
       System.out.println("Inside Static Block");
        System.out.println("Initial Static Variable value is"+ test);
       int y =runTestStatic(20);
        System.out.println("Manipulated Static Variable value through Static Method is"+ y);
    }
}
