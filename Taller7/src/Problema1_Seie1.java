
/**
 * Problema 1
    Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:

	1/10
	2/11
	3/12
	4/13
	5/14
	6/15 
 * @author User
 */
import java.util.Scanner;
public class Problema1_Seie1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,contador=1;
        System.out.print("Dame el limite: ");
        numero=input.nextInt();
        while (contador<=numero) {
            
            System.out.println(contador+"/"+(contador+9));
            contador++;
        }
    }
    
}
/***
 * run:
Dame el limite: 6
1/10
2/11
3/12
4/13
5/14
6/15
 */