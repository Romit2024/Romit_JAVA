import java.util.Arrays;
import java.util.List;

public class StreamAPIs {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");

        // Filter and print names starting with 'A'
        System.out.println("Names starting with 'A':");
        names.stream()
             .filter(name -> name.startsWith("A")) // filter names that start with A
             .forEach(System.out::println);        // print each name
    }
}
