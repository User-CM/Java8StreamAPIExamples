import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {

        System.out.println("Using Sequential Stream:");

        long start = System.currentTimeMillis();

        IntStream.range(1, 1000000)

                .forEach(i -> {}); // Simulated processing​

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms");

        System.out.println("\nUsing Parallel Stream:");

        start = System.currentTimeMillis();

        IntStream.range(1, 1000000)

                .parallel()

                .forEach(i -> {}); // Simulated processing​

        end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms");

    }

}
