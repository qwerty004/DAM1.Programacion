/*
 * Leer numeros mientras no se procese un numero negativo
 * Mostrar cuántos numeros se leyeron.
 */
package leer_numeros_no_negativos_16;
import java.util.Scanner;
public class Leer_numeros_no_negativos_16 {
    public static void main(String[] args) {
        int total=0, numero_nuevo;
        Scanner objeto_escaner = new Scanner(System.in);
        
 /*
*   * * * * * * *  VERSION 1  *******
*/       
//        do {
//            System.out.println("Introduce un número");
//            numero_nuevo=objeto_escaner.nextInt();
//            if (numero_nuevo >=0) {
//                total++;     
//            }
//        } while (numero_nuevo>=0);
/*
*   * * * * * * *  FIN  VERSION 1  *******
*/
       

/*
*   * * * * * * *  VERSION 2  *******
*/
        System.out.println("Introduce un número");
        numero_nuevo=objeto_escaner.nextInt();
        
        while (numero_nuevo>=0) {
            total++;
            System.out.println("Introduce un número");
            numero_nuevo=objeto_escaner.nextInt();   
        }
        
/*
*   * * * * * * *  FIN  VERSION 2  *******
*/
        
        
        System.out.println("El total de numeros no negativos fue de: "+total);
    }  
}