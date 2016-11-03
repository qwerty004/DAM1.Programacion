package primos_19;
import java.util.Scanner;
public class Primos_19 {
    public static void main(String[] args) {
        Scanner objeto_escaner = new Scanner(System.in);
        int n,div=0,i;

        //i1
         long TInicio, TFin, tiempo;
         
        //f1
        System.out.println("introduce un numero");
        n=objeto_escaner.nextInt();
        TInicio = System.currentTimeMillis();
        
        for (i=2;i<=n/2;i++){
            if (n%i==0){
                div++;
            }
        }
        if (div!=0){
            System.out.println("no primo");
        }
        else {
            System.out.println("primo");
            }
            
        //i2  
        TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
        //f2
        
    }
}
