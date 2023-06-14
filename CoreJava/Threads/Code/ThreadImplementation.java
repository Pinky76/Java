public class ThreadImplementation implements Runnable{

    @Override
    public void run() {
        System.out.println("Implementing threads using Runnable Interface :: Inside run method ::");
        for(int i =0; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
