import java.util.Arrays;
import java.util.List;

public class StreamSortingReducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);

        // Sorting​

        List<Integer> sortedNumbers = numbers.stream()

                .sorted()

                .toList();

        System.out.println("Sorted: " + sortedNumbers); // Output: [1, 2, 3, 5, 8]​



        // Reducing - Sum of numbers​

        int sum = numbers.stream()

                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum); // Output: 19​

    }

}