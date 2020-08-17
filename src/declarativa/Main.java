package declarativa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String []args) {

        List<User> users = new ArrayList<>();
        // Filtrar
        //Obtener la cantidad de usuarios con una edad mayor a 18 y que su username comienze con mayuscula.
        users.add(new User("Rafael", 25));
        users.add(new User("daniel", 20));
        users.add(new User("Tania", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 12));

        long count = users.stream()
                        .filter( user -> user.getAge() > 18 )
                        .filter( user -> user.getUsername().startsWith("R") )
                        .count();
        System.out.println(count);



    }
}
