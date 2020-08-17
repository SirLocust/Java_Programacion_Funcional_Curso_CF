package declarativa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String []args) {

        List<User> users = new ArrayList<>();
        //Obtener la cantidad de usuarios con una edad mayor a 18.
        users.add(new User("rafael", 25));
        users.add(new User("daniel", 20));
        users.add(new User("Tania", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 12));


        //Iemperativo
        int count = 0;
        for (int i = 0; i < users.size() ; i++) {
            if(users.get(i).getAge() > 18){
                count++;
            }
        }
        System.out.println("la cantidad de usuarios mayores de edad son "+ count);

        //Declarativo
        long contador = users.stream().filter( user  -> user.getAge() > 18).count();
        System.out.println("la cantidad de usuarios mayores de edad son "+ contador);

    }
}
