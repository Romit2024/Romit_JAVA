import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //Sequential Stream
        Stream<Integer> data1 = numbers.stream();
        int sumOfSquares1 = numbers.stream().map(n -> n*n).reduce(0, Integer::sum);
        data1.forEach(n -> System.out.println(n));
        System.out.println("The Sum of Squares is: " + sumOfSquares1);

        //Parallel Stream
        Stream<Integer> data2 = numbers.stream();
        int sumOfSquares2 = numbers.parallelStream().map(n -> n*n).reduce(0, Integer::sum);
        data2.forEach(n -> System.out.println(n));
        System.out.println("The Sum of Squares is: " + sumOfSquares2);
    }
}
