package main;

public class Main {


    public static void main(String[] args) {

        ISuma suma = (val1, val2) -> val1 + val2;

        int resultado = suma.suma(10,20);
        System.out.println(resultado);
    }

}
