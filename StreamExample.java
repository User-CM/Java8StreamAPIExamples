import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<String> names = List.of("John", "Alice", "Bob", "Anna", "Mike");



        List<String> filteredNames = names.stream()

                .filter(name -> name.startsWith("A")) // Keep names that start with 'A'​

                .map(String::toUpperCase) // Convert to uppercase​

                .collect(Collectors.toList()); // Collect results into a list​



        System.out.println(filteredNames); // Output: [ALICE, ANNA]​

    }

}