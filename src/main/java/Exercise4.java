
import java.util.stream.Stream;

public class Exercise4 {

    public static Stream<Long> random(long a, long c, long m, long seed){
        Stream<Long> longStream =  Stream.iterate(seed, (l) -> ((l * a + c)%m));
        return longStream;
    }

}
