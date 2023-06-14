
public class Main extends Thread{
    public void run(){
        System.out.println("Implementing Threads extending Thread class :: inside run method ::");
        for(int i = 0 ; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    ThreadImplementation thread2 = new ThreadImplementation();
    thread2.run();
    }
}