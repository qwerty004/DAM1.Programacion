/*
 * Leer numeros mientras no se procese un numero negativo
 * Mostrar cuántos numeros se leyeron.
*******  U S A R   V A R I A B L E   S W I T C H
 */
package flag_booleano_17;
import java.util.Scanner;
public class Flag_booleano_17 {
    public static void main(String[] args) {
        int total=0, numero_nuevo, x=9;
        boolean condicion=true;
        Scanner objeto_escaner = new Scanner(System.in);
        
        do {
            System.out.println("Introduce un número");
            numero_nuevo=objeto_escaner.nextInt();
            if (numero_nuevo>=0) {
                total++;
            }
            else{
                condicion=false;
            }
            
        } while (condicion==true);
        System.out.println("El total de numeros no negativos fue de: "+total);
        
        switch(x){
            default: System.out.println("default");
            case 1: System.out.println("uno");
            break;
            case 2: System.out.println("dos");
                    
        }
        
        
    }    
}
