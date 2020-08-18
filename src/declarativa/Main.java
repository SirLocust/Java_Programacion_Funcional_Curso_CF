package declarativa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

        public static void main(String []args) {

            //obtener todos los usuarios que tengan una edad mayor a 18
            List<User> users = new ArrayList<>();

            users.add(new User("raul", 23));
            users.add(new User("paola", 23));
            users.add(new User("luiza", 15));
            users.add(new User("renata", 25));
            users.add(new User("monica", 25));



            User userDefault = new User("sin nombre", 30);



           User usero =  users.stream()
                   .filter( user -> user.getAge() == 30)
                   .findFirst()
                   .orElse(userDefault);

            System.out.println(usero.getUsername());

        }
}
