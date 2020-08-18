package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void  main(String[] data){
        List<String> names1 = Arrays.asList("codi1", "codi2");
        List<String> names2 = Arrays.asList("codi3", "codi4");
        List<String> names3 = Arrays.asList("codi5", "codi6");

        List<String> result = Stream.of(names1, names2, names3)
                                        .flatMap( element -> element.stream())
                                        .collect(Collectors.toList());
        System.out.println(result);
    }
}
