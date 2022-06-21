import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exercise1 {
    private static List<String> names = Arrays.asList("Alisa", "Anton", "Victor", "Oleg", "Nataly", "Hosha");

    public static String sortNames(List<String> nam, Predicate<String> predicate){
        predicate = (n) -> (names.indexOf(n) %2) !=0;
        List<String> result = new ArrayList<>();
        for (String name: nam){
            if (predicate.test(name)) {
                result.add(name);}

        }
        return String.valueOf(result);
    }
}
