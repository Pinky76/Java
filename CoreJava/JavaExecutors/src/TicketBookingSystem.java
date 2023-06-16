import java.util.concurrent.TimeUnit;

public class TicketBookingSystem {
    private int availableTickets;

    public TicketBookingSystem(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public synchronized void bookTicket(int requestedTickets, String threadName) {
        if (requestedTickets <= availableTickets) {
            System.out.println(threadName + " booked " + requestedTickets + " ticket(s).");
            availableTickets -= requestedTickets;
        } else {
            System.out.println(threadName + " could not book tickets. Not enough tickets available.");
        }
    }

    public static void main(String[] args) {
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem(10);

        // Create multiple threads for ticket booking
        Thread thread1 = new Thread(new BookingThread(ticketBookingSystem, 3), "Thread 1");
        Thread thread2 = new Thread(new BookingThread(ticketBookingSystem, 4), "Thread 2");
        Thread thread3 = new Thread(new BookingThread(ticketBookingSystem, 5), "Thread 3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BookingThread implements Runnable {
    private TicketBookingSystem ticketBookingSystem;
    private int requestedTickets;
    public BookingThread(TicketBookingSystem ticketBookingSystem, int requestedTickets) {
        this.ticketBookingSystem = ticketBookingSystem;
        this.requestedTickets = requestedTickets;
    }
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ticketBookingSystem.bookTicket(requestedTickets, Thread.currentThread().getName());
    }
}
