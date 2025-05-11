import java.util.List;
import java.util.Arrays;

public class forEach {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,9,7,2,3,4);
        numbers.forEach(i -> System.out.println(i));
    }
}
