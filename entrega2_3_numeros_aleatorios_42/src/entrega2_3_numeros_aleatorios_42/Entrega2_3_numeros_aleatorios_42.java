package entrega2_3_numeros_aleatorios_42;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class Entrega2_3_numeros_aleatorios_42 {
    static  InputStreamReader flujo=new InputStreamReader(System.in);
    static  BufferedReader teclado=new BufferedReader(flujo);
    
    public static void main(String[] args) throws IOException {
        //aqui defino el rango de valores en el que puede estar el numero oculto
        int minrango,maxrango;
        System.out.println();
        minrango=leerInt("Antes de empezar, debes determinar el rango en que va a estar el número secreto, ambos incluídos. Mínima distancia 10\nIntroduce el valor mínimo del rango\n");
        maxrango=leerInt("Introduce el valor maximo del rango\n");
        
        // Si los valores no son apropiados, el programa obliga a repetir hasta que se cumplan las condiciones
        while (maxrango-10<=minrango) {
            minrango=leerInt("\nHas puesto mal los valores. Hazlo de nuevo, por favor.\nIntroduce el valor mínimo del rango\n");
            maxrango=leerInt("Introduce el valor maximo del rango\n");
        }
             
        //Aquí calcula el número secreto dentro del rango establecido
        int rango=maxrango-minrango+1;
        Random rand;
        rand = new Random();
        int numoculto = rand.nextInt(rango)+minrango; 

        
        
        int cont=1,eleccion,maxintentos;
        maxintentos=leerInt("Introduce el máximo de intentos que tendra JUGADOR 2\n\n\n\n");
        boolean acierto=false; // esta variable mira si se ha acertado la solucion
        eleccion=leerInt("Tienes "+maxintentos+" intentos para acertar el valor secreto entre"+minrango+" y "+maxrango+"\nIntroduce el primer intento\n");

        //el programa da intentos al jugador mientras no se alcance el total o no se acierte la solución
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
                        if (Math.abs(eleccion-numoculto)<rango*0.02){
                            System.out.println("Estás muy muy cerquita de tu objetivo");
                        }
                        else if (Math.abs(eleccion-numoculto)<rango*0.06){
                            System.out.println("Estás bastante cerca de tu objetivo");                            
                        }
                        else if (Math.abs(eleccion-numoculto)>rango*0.15) {
                            System.out.println("Estas muy lejos de tu objetivo!");
                        }
                    }
                    else{
                        System.out.println("Esta vez no has acertado! El número a adivinar es menor\n");   
                        if (Math.abs(eleccion-numoculto)<rango*.02){
                            System.out.println("Estás muy muy cerquita de tu objetivo");
                        }
                        else if (Math.abs(eleccion-numoculto)<rango*0.06){
                            System.out.println("Estás bastante cerca de tu objetivo");                            
                        }
                        else if (Math.abs(eleccion-numoculto)>rango*.15) {
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
