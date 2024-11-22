/**
 * Problema 7
Generar e imprimir la siguiente serie:

sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * @author Cristhian Quizhpe
 */
 
public class Problema7_Serie3 {
    public static void main(String[] args) {
        int i = 1;
        String serie = "sumatoria = "; 

        while (i <= 10) {
           
            if (i == 1) {
                serie += String.format("-(1/%d)", i); 
            } else {
                if (i % 2 == 0) {
                    serie += String.format("+(1/%d)", i);
                } else {
                    serie += String.format("-(1/%d)", i); 
                }
            }
           
            i++;
        }
        System.out.println(serie);
    }
}
/***
 * run:
sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * 
 */

            
            


