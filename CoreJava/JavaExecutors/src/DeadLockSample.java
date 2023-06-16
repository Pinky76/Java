public class DeadLockSample {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        Thread thread1 = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("Thread 1 acquired resource A");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resourceB) {
                    System.out.println("Thread 1 acquired resource B");
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (resourceB) {
                System.out.println("Thread 2 acquired resource B");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resourceA) {
                    System.out.println("Thread 2 acquired resource A");
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
class ResourceA {
    // Empty class representing resource A
}
class ResourceB {
    // Empty class representing resource B
}
