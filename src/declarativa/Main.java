package declarativa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String []args) {

        //Colecion
        List<User> users = new ArrayList<>();

        users.add(new User("raul", 23));
        users.add(new User("paola", 23));
        users.add(new User("luiza", 15));
        users.add(new User("renata", 20));
        users.add(new User("monica", 21));

        //Proceso
        //Iteracion interna


        //

        Stream<User> stream = users.stream();

        System.out.println( stream.filter( user -> user.getAge() > 18).count()) ;




    }
}
