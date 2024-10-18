package pruebaml;

import java.util.*;

public class PruebaML {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World");
        ArrayList<Integer> ci = new ArrayList<Integer>();

        ci.add(55785144);

        System.out.println("Cedula ingresada: " + ci.get(0));
        int cedula;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese cedula");
            cedula = input.nextInt();
            ci.add(cedula);
        }

        for (int i = 0; i < ci.size(); i++) {
            System.out.println("Cedula ingresada: " + ci.get(i));
        }
    }
}