/**
 * Problema 2
   Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:

	5/10
	10/12
	15/14
	20/16
	25/18
	30/20
 * @author User
 */
import java.util.Scanner;
public class Problema2_Serie2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int limite,contador=1,n2=8;
        
        System.out.print("Dame un limite: ");
        limite=input.nextInt();
        
        while (contador<=limite) {
            System.out.println((contador*5)+"/"+(n2+=2));
            contador++;
            
        }
    }
}
/***
 * run:
Dame un limite: 6
5/10
10/12
15/14
20/16
25/18
30/20
 */