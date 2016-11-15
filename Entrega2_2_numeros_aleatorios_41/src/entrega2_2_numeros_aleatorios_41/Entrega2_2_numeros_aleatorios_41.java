package entrega2_2_numeros_aleatorios_41;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class Entrega2_2_numeros_aleatorios_41 {
 static  InputStreamReader flujo=new InputStreamReader(System.in);
 static  BufferedReader teclado=new BufferedReader(flujo);

    public static void main(String[] args) throws IOException {
        Random rand;
        rand = new Random();
        int numoculto = rand.nextInt(100)+1; //generamos un entero aleatorio entre 0 y 99 y le suamamos 1  
        int cont=1,eleccion,maxintentos;
        maxintentos=leerInt("Introduce el máximo de intentos que tendra JUGADOR 2\n\n\n\n");
        boolean acierto=false; // esta variable mira si se ha acertado la solucion
        eleccion=leerInt("Tienes "+maxintentos+" intentos para acertar el valor secreto entre 1 y 100\nIntroduce el primer intento\n");

        
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
                        System.out.println("Esta vez no has acertado! El número a adivinar es mayor");
                        if (Math.abs(eleccion-numoculto)<2){
                            System.out.println("Estás muy muy cerquita de tu objetivo");
                        }
                        else if (Math.abs(eleccion-numoculto)<6){
                            System.out.println("Estás bastante cerca de tu objetivo");                            
                        }
                        else if (Math.abs(eleccion-numoculto)>15) {
                            System.out.println("Estas muy lejos de tu objetivo!");
                        }
                    }
                    else{
                        System.out.println("Esta vez no has acertado! El número a adivinar es menor\n");   
                        if (Math.abs(eleccion-numoculto)<2){
                            System.out.println("Estás muy muy cerquita de tu objetivo");
                        }
                        else if (Math.abs(eleccion-numoculto)<6){
                            System.out.println("Estás bastante cerca de tu objetivo");                            
                        }
                        else if (Math.abs(eleccion-numoculto)>15) {
                            System.out.println("Estas muy lejos de tu objetivo!");
                        }
                        
                    } 
                    int restantes=maxintentos-cont;
                    eleccion=leerInt("\nInténtalo de nuevo. Te quedan "+restantes+" intentos\n");
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
