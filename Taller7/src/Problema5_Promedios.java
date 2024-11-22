/**
 * Problema 5
   Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos ingresar el nombre del estudiante, 
   *el promedio de ciclo. Presentar el siguiente reporte

        Estudiante 1	10	Aprobado
        Estudiante 2	6.9	Reprobado
        Estudiante 3	7	Aprobado
        Estudiante 4	5	Reprobado
   Atención; con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 * @author Cristhian Quizhpe 
 */
import java.util.Scanner;

public class Problema5_Promedios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reporte = "Estudiante\tPromedio\tEstado\n";
        int contador = 1;

        while (contador <= 4) {
            System.out.printf("Ingrese el nombre del estudiante %d: ", contador);
            String nombre = input.nextLine();

            System.out.print("Ingrese el promedio del ciclo: ");
            double promedio = input.nextDouble();
            input.nextLine();

            String estado = promedio >= 7 ? "Aprobado" : "Reprobado";
            reporte += String.format("%s\t%.1f\t%s%n", nombre, promedio, estado);

            contador++;
        }
        System.out.println("\nReporte:");
        System.out.println(reporte);
    }
}
/***
 * run:
Ingrese el nombre del estudiante 1: Alex
Ingrese el promedio del ciclo: 10
Ingrese el nombre del estudiante 2: Felix
Ingrese el promedio del ciclo: 6,9
Ingrese el nombre del estudiante 3: Karen
Ingrese el promedio del ciclo: 7
Ingrese el nombre del estudiante 4: Angie
Ingrese el promedio del ciclo: 5

Reporte:
Estudiante	Promedio	Estado
Alex            10,0            Aprobado
Felix           6,9             Reprobado
Karen           7,0             Aprobado
Angie           5,0             Reprobado

 */
