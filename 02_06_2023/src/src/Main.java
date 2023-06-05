public class Main extends Child{
    public static void main(String[] args){
//        Multiple Inheritance Demo using Interfaces
        InterfaceImpl int1 = new InterfaceImpl();
        int1.runInterface1();
        int1.runInterface2();

        Child c = new Child();
        Child c1 = new Child("Child Class with 2 Parameters is Initialized", "\nParent is Initialised in the Child Constructor with 2 Parameters");
        Child c2 = new Child("Child is initialised through Single Parameter Constructor");
//        Static Demo
        StaticImplementation s = new StaticImplementation();
//  Final Key word Demo
        FinalImplementation f = new FinalImplementation();
        System.out.println("Initial Final Value is"+ f.x);
        System.out.println("Final Method is called"+f.finalRun());
    }
}