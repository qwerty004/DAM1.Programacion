package pinta_cuadrado_22;
import java.util.Scanner;
public class Pinta_cuadrado_22 {

    public static void main(String[] args) {
        int lado;
      Scanner objeto_escaner = new Scanner(System.in);
        System.out.println("Dame un número entero entre 1 y 14");
       lado=objeto_escaner.nextInt();
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
    }
}
