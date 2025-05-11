import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIs {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8,6,9,12,4,5,1);
        Stream<Integer> data = numbers.stream();
        Stream<Integer> sortedData = data.sorted();
        sortedData.forEach(n -> System.out.println(n));
    }
}