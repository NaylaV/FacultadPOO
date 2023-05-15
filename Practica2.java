import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre[] = new String[4];//vector
        double[][] notas = new double[4][3];//matriz

        //cargar nombre y nota
        for (int i=0;i<4;i++){
            System.out.println("Ingrese nombre del alumno "+(i+1)+": ");
            nombre[i] = entrada.nextLine();
            for (int j=0;j<3;j++){
                System.out.println("Ingrese nota del  trimestre "+(j+1)+" : ");
                notas[i][j]=entrada.nextDouble();
            }
            entrada.nextLine(); //para salto de linea
        }

        //imprimir nombre,nota y el promedio
        for (int i=0;i<4;i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += notas[i][j];
            }
            double promedio = suma/3;
            System.out.println("Las notas del alumno "+nombre[i]+" son:"+notas[i][0]+" "+notas[i][1]+" "+notas[i][2]);//cambair nota por un 1 o mas haci no aparece cero
            System.out.println("El promedio del alumno es: "+ promedio);
            if (promedio >= 6){
                System.out.println("Aprobado");
            }else {
                System.out.println("Desaprobado");
            }
        }
    }
}
