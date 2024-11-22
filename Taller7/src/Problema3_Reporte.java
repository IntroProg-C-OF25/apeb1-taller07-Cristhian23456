/**
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados.
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo. 
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:

Nombre 1	10	$2.5	$25
Nombre 2	11	$2	$22
Nombre 3	9	$3	$27
Nombre 4	5	$4	$20
Nombre 5	12	$2	$24
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;

public class Problema3_Reporte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reporte = "Nombre\tDias\tCostoDia\tTotal\n";
        int contador = 1,dias;
        double costoDia, total;
        while (contador <= 5) {
            System.out.printf("Ingrese el nombre del empleado %d: ", contador);
            String nombre = input.nextLine();

            System.out.print("Ingrese los dias trabajados: ");
            dias = input.nextInt();

            System.out.print("Ingrese el costo del dia: ");
            costoDia = input.nextDouble();
            input.nextLine();

            total = dias * costoDia;
            reporte += String.format("%s\t%d\t$%.2f\t$%.2f%n", nombre, dias, costoDia, total);

            contador++;
        }
        System.out.println("\nReporte:");
        System.out.println(reporte);
    }
}
/***
 *  run:
    Ingrese el nombre del empleado 1: Alex
    Ingrese los dias trabajados: 10
    Ingrese el costo del dia: 2,5
    Ingrese el nombre del empleado 2: Felipe
    Ingrese los dias trabajados: 11
    Ingrese el costo del dia: 2
    Ingrese el nombre del empleado 3: Alberto
    Ingrese los dias trabajados: 9
    Ingrese el costo del dia: 3
    Ingrese el nombre del empleado 4: Andrea
    Ingrese los dias trabajados: 5
    Ingrese el costo del dia: 4
    Ingrese el nombre del empleado 5: Karen
    Ingrese los dias trabajados: 12
    Ingrese el costo del dia: 2

Reporte:
Nombre	Dias	CostoDia	Total
Alex	10	$2,50           $25,00
Felipe	11	$2,00           $22,00
Alberto	9	$3,00           $27,00
Andrea	5	$4,00           $20,00
Karen	12	$2,00           $24,00
 */
