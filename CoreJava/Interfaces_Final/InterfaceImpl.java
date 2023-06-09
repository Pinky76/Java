public class InterfaceImpl implements Interface1,Interface2{

    @Override
    public void runInterface1() {
        System.out.println("Interface 1 Implementation");
    }

    @Override
    public void runInterface2() {
        System.out.println("Interface 2 Implementation");
    }
}
