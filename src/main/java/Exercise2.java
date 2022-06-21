import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Exercise2 {
    private static List<String> names = Arrays.asList("Alisa", "Anton", "Victor", "Oleg", "Nataly", "Hosha");

    public static List<String> sort(List<String> nam,  Function<String, String> function){
        function = (n) -> n.toUpperCase();
        List<String> result = new ArrayList<>();
        Collections.sort(nam);
        for (int i = nam.size()-1; i >=0; i--) {
            result.add( function.apply(nam.get(i)));
        }

        return result;
    }
}
