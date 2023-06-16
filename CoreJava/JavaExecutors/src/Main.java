import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static final int ARRAY_SIZE = 100;
    private static final int THREAD_COUNT = 5;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }

        // Create an ExecutorService with a fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);
        System.out.println("Threads are"+executorService);

        // Divide the array into equal parts for each thread
        int partitionSize = ARRAY_SIZE / THREAD_COUNT;
        List<Callable<Integer>> tasks = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            int startIndex = i * partitionSize;
            System.out.println("StartIndex is"+ startIndex);
            int endIndex = (i + 1) * partitionSize;
            System.out.println("EndIndex is"+ endIndex);
            Callable<Integer> task = new ArraySumTask(array, startIndex, endIndex);
            tasks.add(task);
            System.out.println("tasks are"+task);
        }

        try {
            List<Future<Integer>> futures = executorService.invokeAll(tasks);
            int sum = 0;
            for (Future<Integer> future : futures) {
                sum += future.get();
            }
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Shutdown the executor
            executorService.shutdown();
        }
    }
}

class ArraySumTask implements Callable<Integer> {
    private int[] array;
    private int startIndex;
    private int endIndex;

    public ArraySumTask(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += array[i];
        }
        return sum;
    }
}
