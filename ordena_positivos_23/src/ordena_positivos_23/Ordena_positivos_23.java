//algoritmo que lea 20 numeros positivos y diga cual es el mayor
package ordena_positivos_23;
import java.util.Scanner;
public class Ordena_positivos_23 {
    public static void main(String[] args) {
        // ejemplo de string
        String cadena=  "cadenita de oro";
        int longitud = cadena.length();
        System.out.println("el tamño de la cadena es "+longitud);
        // fin ejemplo
        int nota,total;
        int mayor = Integer.MIN_VALUE;
        Scanner objeto_escaner = new Scanner(System.in);
        System.out.println("Cuántos números quieres procesar?");
        total=objeto_escaner.nextInt();
        if (total<1){
            System.out.println("hay que procesar por lo menos un número");
            System.out.println("Cuántos números quieres procesar?");
            total=objeto_escaner.nextInt();
        }
        for (int i=1;i<=total;i++){
            System.out.println("Introduzca el número "+i+"º");
            nota=objeto_escaner.nextInt();         
            mayor=Math.max(mayor, nota);
        }
        if (mayor == 0){
            System.out.println("No has introducido ningún número positivo");
        }
        else {
        System.out.println("El mayor es "+mayor);
        }
    }
       
}
    
   
