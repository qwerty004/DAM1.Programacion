
package menu_opciones_calculos_30;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Menu_opciones_calculos_30 {
    public static void main(String[] args) throws IOException {
        int opcion;
        float x;
        
        InputStreamReader flujo;
        flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(" * * * * MENU PARA REALIZAR DIVERSOS CÁLCULOS * * * * ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("Introduzca un número");
        x=Float.parseFloat(teclado.readLine());
        do {
            System.out.println("\n\nElija una de las siguientes opciones: ");
            System.out.println("    Pulse 1 para hallar el valor absoluto");
            System.out.println("    Pulse 2 para hallar su raíz cuadrada");
            System.out.println("    Pulse 3 para devolver la parte entera");
            System.out.println("    Pulse 4 para redondear hacia arriba");
            System.out.println("    Pulse 5 para elevarlo a un exponente");
            System.out.println("    Pulse 6 para devolver el mayor de 2 números");
            System.out.println("    Pulse 7 para salir");
            opcion=Integer.parseInt(teclado.readLine());


            switch (opcion){
                case 1:
                    System.out.println("El valor absoluto es: "+Math.abs(x));
                   break;
                case 2:
                    System.out.println("Su raíz es: "+Math.sqrt(x));
                    break;
                case 3:
                    System.out.println("su parte entera es: "+Math.floor(x));
                    break;
                case 4:
                    System.out.println("Redondeado hacia arriba es: "+Math.ceil(x));
                   break;                
                case 5:  
                    int b;
                    System.out.println("Introduzca un exponente al que elevar "+x);               
                    b=Integer.parseInt(teclado.readLine());
                    System.out.println(x+" eleveado a "+b+" = "+Math.pow(x, b));
                    break;
                case 6:             
                    System.out.println("Introduzca otro número con el que comparar x");
                    float y;
                    y=Float.parseFloat(teclado.readLine());
                    System.out.println("El mayor es "+Math.max(x, y));
                    break;
                case 7:               
                    System.out.println("Ha elegido salir");
                    break;
                default:
                    System.out.println("Opción mal introducida");
                    break;

            }
        } while (opcion!=7);
        
    }
    
}
