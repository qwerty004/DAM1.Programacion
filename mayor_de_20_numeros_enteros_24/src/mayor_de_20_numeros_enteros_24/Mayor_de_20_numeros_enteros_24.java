//algoritmo que lea 20 numeros enteros y diga cual es el mayor
package mayor_de_20_numeros_enteros_24;
import java.util.Scanner;
public class Mayor_de_20_numeros_enteros_24 {
    public static void main(String[] args) {
        int nota,mayor,total;
        //int mayor = Integer.MIN_VALUE; //el menor entero posible=-2^31
        Scanner objeto_escaner = new Scanner(System.in);
        System.out.println("Cuántos números quieres procesar?");
        total=objeto_escaner.nextInt();
        if (total<1){
            System.out.println("hay que procesar por lo menos un número");
            System.out.println("Cuántos números quieres procesar?");
            total=objeto_escaner.nextInt();
        }
        
        System.out.println("Introduzca el número 1º");
        mayor=objeto_escaner.nextInt();
        
        for (int i=2;i<=total;i++){
            System.out.println("Introduzca el número "+i+"º");
            nota=objeto_escaner.nextInt();
            mayor=Math.max(mayor, nota);
        }
        System.out.println("El mayor es "+mayor);
    }
       
}
