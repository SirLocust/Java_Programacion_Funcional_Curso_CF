package map;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static  void main(String ...args){
        // OBtener el cuadrado de todos los numeros de la lista.

        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);

        numeros = numeros.stream().map( num -> num * num ).collect(Collectors.toList());

        System.out.println(numeros);
    }
}