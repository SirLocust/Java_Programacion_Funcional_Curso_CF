package map;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static  void main(String ...args){
        // OBtener el cuadrado de todos los numeros de la lista.

        List<Integer> numeros = List.of(10,10,9,6,6,7,8,9,10);

        Long cantidad = numeros.stream().filter(n -> n > 6).count();

        System.out.println(cantidad);
        int suma = numeros.stream().mapToInt( n -> n ).sum();
        System.out.println(suma);
        double promedio =numeros.stream().mapToInt(n -> n).average().orElse(0);
        int minimo = numeros.stream().mapToInt(n -> n).min().getAsInt();
    }
}
