package map;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static  void main(String ...args){
        // OBtener el cuadrado de todos los numeros de la lista.

        List<Integer> numeros = List.of(10,10,9,6,6,7,8,9,10);

       boolean result = numeros.stream()
                                .anyMatch( num -> num < 6);

        System.out.println(result);
    }
}
