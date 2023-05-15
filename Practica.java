import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*int vector[] = new int[4];
        int i;

        for (i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero entero: ");
            vector[i] = entrada.nextInt();
        }
        for (i = 0; i < 4; i++) {
            System.out.println("El nombre en la posicion " + i + " es " + vector[i]);
        }*/

        String palabra;

        System.out.println("Como te llamas: ");
        palabra = entrada.nextLine();
        System.out.println(" Hola " + palabra);



    }
}
