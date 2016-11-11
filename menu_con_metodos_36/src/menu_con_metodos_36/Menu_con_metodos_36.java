// c) implementar dos metodos de calculos de distinta forma a los aptdos anteriores
//    - leer datos y mostrar el resultado del calculo
//    - leer datos y devuelve el resultado  
//    - pasamos los datos como argumento y devuelve el resultado
//
package menu_con_metodos_36;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Menu_con_metodos_36 {
    
    public static float devuelveCalculos (int n) throws IOException  {
     float x,resultado=0;
        
        InputStreamReader flujo;
        flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        
        System.out.println("Introduzca un número");
        x=Float.parseFloat(teclado.readLine());


        switch (n){
                case 1:
                    resultado=Math.abs(x);
                   break;
                case 2:
                    resultado=(float) Math.sqrt(x);
                    break;
                case 3:
                    resultado=(float) Math.floor(x);
                    break;
                case 4:
                    resultado=(float) Math.ceil(x);
                   break;                
                case 5:  
                    int b;
                    System.out.println("Introduzca un exponente al que elevar "+x);               
                    b=Integer.parseInt(teclado.readLine());
                    resultado=(float) Math.pow(x, b);
                    break;
                case 6:             
                    System.out.println("Introduzca otro número con el que comparar x");
                    float y;
                    y=Float.parseFloat(teclado.readLine());
                    resultado=Math.max(x, y);
                    break;
            }
                    return resultado;
    }

    
    
    public static void imprimeCalculos(int n) throws IOException  {
        float x;
        
        InputStreamReader flujo;
        flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        
        System.out.println("Introduzca un número");
        x=Float.parseFloat(teclado.readLine());

                switch (n){
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
            }         
 }
    
    
    
    
    public static void main(String[] args) throws IOException {        
        int opcion;
        float resultado;
        
        InputStreamReader flujo;
        flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(" * * * * MENU PARA REALIZAR DIVERSOS CÁLCULOS * * * * ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * ");

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
            if (opcion<1 || opcion > 7){
                System.out.println("Opcion mal introducida. Intente otra vez");
            }
            else if (opcion==7) {
                break;
            }
            else {
                int op;
                    System.out.println("Pulsa 1 para llamar a imprimeCalculos");
                    System.out.println("Pulsa 2 para llamar a devuelveCalculos");
                    op=Integer.parseInt(teclado.readLine());
                    
                    while (op!=1 && op!=2){
                        System.out.println("Error. Vuelva a introducir");         
                        System.out.println("Pulsa 1 para llamar a imprimeCalculos");
                        System.out.println("Pulsa 2 para llamar a devuelveCalculos");
                        op=Integer.parseInt(teclado.readLine());
                    }
                   
                    switch (op) {
                    case 1:    
                        imprimeCalculos(opcion);
                    case 2:
                        resultado=devuelveCalculos(opcion);
                        System.out.println("El resultado es "+resultado);
                    }                    
            }
        } while (opcion != 7);          
    }    
}
