import java.util.*;
import java.util.function.Predicate;

public class Exercise1 {
    private static List<String> names = Arrays.asList("Alisa", "Anton", "Victor", "Oleg", "Nataly", "Hosha");

    public static String sortNames(List<String> nam){
        Predicate<String> predicate = (n) -> (names.indexOf(n) %2) !=0;
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < nam.size(); i++) {
//            if (predicate.test(nam.get(i))){
//                result.add( i + ". " + nam.get(i) + " ");
//            }
//        }

        String s = "";
        for (int i = 0; i < nam.size(); i++) {
            if (predicate.test(nam.get(i))){
                s += i + ". " + nam.get(i) + " ";
            }
        }


        return s.strip();
    }

    public static void main(String[] args) {
        System.out.println(sortNames(names));
    }
}
