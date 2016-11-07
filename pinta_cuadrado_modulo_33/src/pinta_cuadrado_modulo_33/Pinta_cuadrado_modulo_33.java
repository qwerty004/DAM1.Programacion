
package pinta_cuadrado_modulo_33;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Pinta_cuadrado_modulo_33 {
    
    public static void pintacuadrado(int lado)  {
       
        if (lado > 0 && lado < 3){
           for ( int i=1; i<=lado;i++) {
               for ( int j=1; j<=lado;j++) {
                   System.out.print("* ");
               }
               System.out.println("");
           }
       }
       else if (lado>2 && lado<15){
            for ( int i=1; i<=lado;i++) {
                   System.out.print("* ");
               }
               System.out.println("");
            for ( int i=2; i<=lado-1;i++) {
                System.out.print("* ");
               for ( int j=2; j<=lado-1;j++) {
                   System.out.print("  ");
               }
               System.out.print("* ");
               System.out.println("");
           }
            for ( int i=1; i<=lado;i++) {
                System.out.print("* ");
            }
       }     
    
       System.out.println("\nEl área del cuadrado es "+lado*lado);
 }

    public static void main(String[] args) throws IOException {
        int lado;
        
        InputStreamReader flujo;
        flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        
        
        System.out.println("Dame un número entero entre 1 y 14");
        lado=Integer.parseInt(teclado.readLine());
        
        pintacuadrado(lado);
        
               
    }
}
