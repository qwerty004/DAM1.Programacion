
package ejercicio_arrays_48;
/*
Leer y almacenar 15 numeros
Mostrarlos en orden inverso
Permitir hacer una consulta si existe un nª determinado
Buscar y mostrar el mayor


Crear los metodos:
	Mostrar datos
Invertir los valores de la tabla con tabla auxiliar o no.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_arrays_48 {
    private static final byte TAMANO=5; 
    
    static  InputStreamReader flujo=new InputStreamReader(System.in);
    static  BufferedReader teclado=new BufferedReader(flujo);
    
    
    static int leerInt (String texto) throws IOException {
    int numero;
    
        System.out.print(texto);
        numero= Integer.parseInt(teclado.readLine());
        return numero;
    }

    public static void main(String[] args) throws IOException {
        int vector[] = new int [TAMANO];
        int leerdenuevo=0;
        int num_a_buscar;
        boolean coincidencia=false;
        int mini = 0, maxi = 0;
        
        try{
        
        for (byte i=0;i<TAMANO;i++){
            vector[i]=leerInt("Dame el número "+(i+1)+"º\n");
        }
        for (byte i=TAMANO;i<0;i--){
            System.out.println("El elemento de posición "+i+" es igual a "+vector[i]);
        }

        leerdenuevo=leerInt("¿Quieres buscar un número?\nNO=0 ; SI=1\n");
        if (leerdenuevo==1){
            num_a_buscar=leerInt("Qué número quieres comprobar si está?\n");
            
            for (byte i=0;i<TAMANO;i++){
                
                if (num_a_buscar==vector[i]){
                    System.out.println("El número que buscas está en la posición "+(i+1));
                    coincidencia=true;
                    return;
                }  
            }
            if (coincidencia==false){
                System.out.println("No se encuentra el número");
            }
        }
        
        mini=vector[0];
        maxi=mini;
        for (byte i=1;i<TAMANO;i++){
            mini=Math.min(mini, vector[i]);
            maxi=Math.max(maxi, vector[i]);
        }
        
        } catch (IndexOutOfBoundsException o){
        } catch (NumberFormatException o){
        } catch (Exception o){
            
        }
        System.out.println("el menor es "+mini);
        System.out.println("el mayor es "+maxi);
        
        
    }    
}
