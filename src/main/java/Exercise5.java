import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise5 {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> f = first.collect(Collectors.toList());
        List<T> s = second.collect(Collectors.toList());

    Stream.Builder<T> streamBuilder =  Stream.builder();

    if (f.size()> s.size()){
        for (int i = 0; i < s.size(); i++) {
            streamBuilder.accept(f.get(i));
            streamBuilder.accept(s.get(i));
        }
    }

        if (f.size()< s.size()){
            for (int i = 0; i < f.size(); i++) {
                streamBuilder.accept(f.get(i));
                streamBuilder.accept(s.get(i));
            }
        }

       Stream<T> stream = streamBuilder.build();

        return stream;
    }
}
