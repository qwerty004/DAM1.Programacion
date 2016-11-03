//Leer varios numeros y muestra cual es el mayor
//El usuario indica si quiere seguir o no
package otro_numero_mas_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Otro_numero_mas_26 {

    public static void main(String[] args) throws IOException{
       
        int n, bandera=0,mayor;
        String eleccion;
        InputStreamReader flujo;
        flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
                
        System.out.println("introduzca un número");
        n=Integer.parseInt(teclado.readLine());
        mayor=n;
                
        while (bandera==0){
            System.out.println("Desea continuar introduciendo números?");
            eleccion=teclado.readLine();
            char inicial=Character.toUpperCase(eleccion.charAt(0));
            if (inicial=='S'){
                System.out.println("introduzca otro número");
                n=Integer.parseInt(teclado.readLine());
                mayor=Math.max(mayor, n);
            }
            else {
                bandera=1;
            } 
        }
        System.out.println("El mayor es "+mayor);
    } 
}
