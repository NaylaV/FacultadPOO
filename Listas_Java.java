/*Crear un programa que pueda ingresar datos por teclado de personas (dni, nombre), la cantidad que desee y los guarde en una lista. Cuando desee finalizar que me imprima los datos ingresados*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas_Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Persona> ListasPersona = new ArrayList<>();

        System.out.println("Ingrese la cantidad de personas que desea ingresar: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese su nombre: ");
            String nombre= entrada.nextLine();
            System.out.println("Ingrese su DNI: ");
            String dni=entrada.nextLine();

            Persona persona = new Persona(dni, nombre);
            ListasPersona.add(persona);
        }

        System.out.println("\nDatos ingresados:");
        for (int i = 0; i < ListasPersona.size(); i++) {
            Persona persona = ListasPersona.get(i);
            System.out.println("Nombre: "+persona.getNombre() + " - " + "DNI: "+ persona.getDni());
        }
    }
}
