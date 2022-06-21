import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    private static List<String> list = Arrays.asList("1, 2, 0", "4, 5");

    public static void main(String[] args) {
        String [] l = {""};

         String result = Arrays.stream(list.stream()
                .map(s -> l[0] += s + ",")
                .flatMap((p) -> Arrays.asList(p.split(","))
                .stream()).toArray(String[]::new))
                .distinct()
                .map(s -> s.strip())
                //.mapToInt(s -> Integer.parseInt(s))
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
