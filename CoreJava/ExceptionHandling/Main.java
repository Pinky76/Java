class MyException extends Exception {
    public MyException(String a)
    {
      try{
          String s = a.charAt(a.length())+a;
          System.out.println("Inside Custom exception class constructor");
          System.out.println("Passed Object is :: "+s);
      }
      catch(Exception e){
          System.out.println("Custom Exception is :: "+e);
      }
//        super(a.charAt(a.length())+a);
    }
}
class MyExceptionSuper extends Exception{
    public MyExceptionSuper(String s){
        super(s);
    }
}
public class Main {
    public static void main(String args[]) {
        try {
            String a = "test";
            System.out.println("");
            throw new MyException(a);
        } catch (MyException ex) {
            System.out.println("User defined Class Exception :: "+ex);

        }
        try{
            throw new MyExceptionSuper("Testing");
        }
        catch(MyExceptionSuper e){
            System.out.println("User defined Class Exception using Super:: "+e);
        }
    }
}