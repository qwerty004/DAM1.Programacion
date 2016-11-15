
package entrega2_1_numeros_aleatorios_40;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Entrega2_1_numeros_aleatorios_40 {
    static  InputStreamReader flujo=new InputStreamReader(System.in);
    static  BufferedReader teclado=new BufferedReader(flujo);

    public static void main(String[] args) throws IOException {

        int cont=1,eleccion,numoculto,maxintentos;
        boolean acierto=false; // esta variable mira si se ha acertado la solucion
        numoculto=leerInt("JUGADOR 1. Introduce el numero a adivinar.\nDebe estar entre 1 y 100\n");
        while (numoculto>100 || numoculto < 1) {
            numoculto=leerInt("No estás en el rango. Vuelve a introducir el valor\n");
        }
        maxintentos=leerInt("Introduce el máximo de intentos que tendra JUGADOR 2\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        eleccion=leerInt("JUGADOR 2: Tienes "+maxintentos+" intentos para acertar el valor secreto entre 1 y 100\nIntroduce el primer intento\n");
        
        while (cont<=maxintentos && acierto==false){
            if (eleccion==numoculto) {
                System.out.println("Correcto! Has acertado");
                acierto=true;
            }
            else {
                if (cont==maxintentos) {
                    System.out.println("Lo siento, has perdido. El número era "+numoculto);
                    break;
                }
                else { 
                    if (eleccion<numoculto) {
                        System.out.println("Esta vez no has acertado! El número a adivinar es mayor\n");
                    }
                    else{
                        System.out.println("Esta vez no has acertado! El número a adivinar es menor\n");   
                        
                    } 
                    int restantes=maxintentos-cont;
                    eleccion=leerInt("Inténtalo de nuevo. Te quedan "+restantes+" intentos\n");
                }
                cont++;
            }
            
        }
    }
    
    static int leerInt (String texto) throws IOException {
    int numero;
    
        System.out.print(texto);
        numero= Integer.parseInt(teclado.readLine());
        return numero;
    }
    
}
