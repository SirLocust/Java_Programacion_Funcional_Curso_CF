package declarativa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String []args) {

        //Colecion

        List<User> users = new ArrayList<>();
        Stream<User> stream = users.stream();// Abstraccion

        //Stream

        Stream<User> filter =   stream.filter( user -> user.getAge() > 18);

        //arreglo

        int[] numbers = {1,2,3,4,5};
        Stream<int[]> numersS = Stream.of(numbers);

        //secuencia

        Stream<String> names = Stream.of("codiugo1","codi2","coduide3");





    }
}
