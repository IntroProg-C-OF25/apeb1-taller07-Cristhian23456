/**
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento 
 * por tipo de cliente: Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20% 
 * En caso que sea otro tipo de cliente, no hay descuento. Generar un proceso que permita ingresar 7 ventas: 
 * por cada venta preguntar los siguiente datos:

Nombre del cliente
Costo de la computadora (solo se vende una computadora por transacción)
Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;

public class Problema6_Computadoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reporte = "";
        int contador = 1, tipoCliente;
        double costo, descuento,precioFinal;
        while (contador <= 7) {
            System.out.printf("Ingrese el nombre del cliente %d: ", contador);
            String nombre = input.nextLine();

            System.out.print("Ingrese el costo de la computadora: ");
            costo = input.nextDouble();

            System.out.print("Ingrese el tipo de cliente (1, 2, otro): ");
            tipoCliente = input.nextInt();
            input.nextLine(); 
            //if ternario
            descuento = tipoCliente == 1 ? 0.1 : (tipoCliente == 2 ? 0.2 : 0);
            precioFinal = costo - (costo * descuento);

            reporte += String.format("Cliente: %s, compra computadora con precio final $%.2f%n", nombre, precioFinal);
            contador++;
        }
        System.out.println("\nReporte:");
        System.out.println(reporte);
    }
}
/***
 * run:
Ingrese el nombre del cliente 1: Diego 
Ingrese el costo de la computadora: 300
Ingrese el tipo de cliente (1, 2, otro): 2
Ingrese el nombre del cliente 2: Alex
Ingrese el costo de la computadora: 450
Ingrese el tipo de cliente (1, 2, otro): 1
Ingrese el nombre del cliente 3: Felix
Ingrese el costo de la computadora: 550
Ingrese el tipo de cliente (1, 2, otro): 3
Ingrese el nombre del cliente 4: Alberto
Ingrese el costo de la computadora: 438
Ingrese el tipo de cliente (1, 2, otro): 2
Ingrese el nombre del cliente 5: daniel
Ingrese el costo de la computadora: 763
Ingrese el tipo de cliente (1, 2, otro): 1
Ingrese el nombre del cliente 6: Alejandra
Ingrese el costo de la computadora: 465
Ingrese el tipo de cliente (1, 2, otro): 2
Ingrese el nombre del cliente 7: rodrigo
Ingrese el costo de la computadora: 354
Ingrese el tipo de cliente (1, 2, otro): 3

Reporte:
Cliente: Diego , compra computadora con precio final $240,00
Cliente: Alex, compra computadora con precio final $405,00
Cliente: Felix, compra computadora con precio final $550,00
Cliente: Alberto, compra computadora con precio final $350,40
Cliente: daniel, compra computadora con precio final $686,70
Cliente: Alejandra, compra computadora con precio final $372,00
Cliente: rodrigo, compra computadora con precio final $354,00
 */