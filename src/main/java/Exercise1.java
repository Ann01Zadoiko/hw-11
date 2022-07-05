import java.util.*;
import java.util.function.Predicate;

public class Exercise1 {
    private static List<String> names = Arrays.asList("Alisa", "Anton", "Victor", "Oleg", "Nataly", "Hosha");

    public static List<String> sortNames(List<String> nam){
        Predicate<String> predicate = (n) -> (names.indexOf(n) %2) !=0;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nam.size(); i++) {
            if (predicate.test(nam.get(i))){
                result.add( i + ". " + nam.get(i) + " ");
            }
        }

        return result;
    }

}
