/**
 * Problema 4
Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:

Nombre el jugador
Posición en el campo de juego
Edad
Estatura
El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte (usar una cadena de acumulación):

Listado de Jugadores
1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
4. Ángel Mena -Delantero-, edad 32, estatura 1.75
5. Michael Estrada -Delantero-, edad 27, estatura 1.93
Promedio de edades:  26.8
Promedio de estaturas: 1.87
 * @author User
 */
import java.util.Scanner;

public class Problema4_Listado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reporte = "Listado de Jugadores\n";
        int contador = 0, edad;
        double sumaEdades = 0, sumaEstaturas = 0, estatura, promedioEstatura, promedioEdad;
        boolean continuar = true;

        while (continuar) {
            contador++;
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = input.nextLine();

            System.out.print("Ingrese la posicion del jugador: ");
            String posicion = input.nextLine();

            System.out.print("Ingrese la edad del jugador: ");
            edad = input.nextInt();

            System.out.print("Ingrese la estatura del jugador: ");
            estatura = input.nextDouble();
            input.nextLine(); 

            sumaEdades += edad;
            sumaEstaturas += estatura;

            reporte += String.format("%d. %s -%s-, edad %d, estatura %.2f%n", contador, nombre, posicion, edad, estatura);

            System.out.print("Desea ingresar otro jugador? (true/false): ");
            continuar = input.nextBoolean();
            input.nextLine(); 
        }

        promedioEdad = sumaEdades / contador;
        promedioEstatura = sumaEstaturas / contador;

        reporte += String.format("Promedio de edades: %.1f%nPromedio de estaturas: %.2f", promedioEdad, promedioEstatura);
        System.out.println("\n" + reporte);
    }
}
/***
 * run:
Ingrese el nombre del jugador: Alxander Dominguuez
Ingrese la posicion del jugador: Arquero
Ingrese la edad del jugador: 32
Ingrese la estatura del jugador: 1,95
Desea ingresar otro jugador? (true/false): true
Ingrese el nombre del jugador: Xavier Arreaga
Ingrese la posicion del jugador: Defensa
Ingrese la edad del jugador: 24
Ingrese la estatura del jugador: 1,85
Desea ingresar otro jugador? (true/false): true
Ingrese el nombre del jugador: Moises Caicedo
Ingrese la posicion del jugador: Mediocentro
Ingrese la edad del jugador: 19
Ingrese la estatura del jugador: 1,88
Desea ingresar otro jugador? (true/false): true
Ingrese el nombre del jugador: Angel Mina
Ingrese la posicion del jugador: Delantero
Ingrese la edad del jugador: 32
Ingrese la estatura del jugador: 1,75
Desea ingresar otro jugador? (true/false): true
Ingrese el nombre del jugador: Michael Estrada
Ingrese la posicion del jugador: Delantero
Ingrese la edad del jugador: 27
Ingrese la estatura del jugador: 1,93
Desea ingresar otro jugador? (true/false): false

Listado de Jugadores
1. Alxander Dominguuez -Arquero-, edad 32, estatura 1,95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1,85
3. Moises Caicedo -Mediocentro-, edad 19, estatura 1,88
4. Angel Mina -Delantero-, edad 32, estatura 1,75
5. Michael Estrada -Delantero-, edad 27, estatura 1,93
Promedio de edades: 26,8
Promedio de estaturas: 1,87
 * 
 */
