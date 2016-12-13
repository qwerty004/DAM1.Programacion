package ejercicio_arrays_metodos_49;

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


public class Ejercicio_arrays_metodos_49 {
 private static final byte TAMANO=5; 
    
    static  InputStreamReader flujo=new InputStreamReader(System.in);

    static  BufferedReader teclado=new BufferedReader(flujo);
    
    
    /**
     * 
     * @param vector
     * @return 
     */
    static int [] invertirArray (int [] vector){
        int temporal;
        for (byte i=1;i<TAMANO/2;i++){
            temporal=vector[i];
            vector[i]=vector[TAMANO-(i+1)];
            vector[TAMANO-(i+1)]=temporal;  
        }
        return vector;
    }
    
    /**
     * 
     * @param texto
     * @return
     * @throws IOException 
     */
    static int leerInt (String texto) throws IOException {
    int numero = 0;
    
        System.out.print(texto);
        try {
        numero= Integer.parseInt(teclado.readLine());
        } catch (NumberFormatException o){
            System.out.println("Error. Formato de numero no válido");        
        }
        return numero;
    }

    /**
     * 
     * @param vector 
     */
    static void buscaMayor (int [] vector){
        int maxi=vector[0];
        for (byte i=1;i<TAMANO;i++){
            maxi=Math.max(maxi, vector[i]);
        }
        System.out.println("El mayor es "+maxi);
    }
    
    /**
     * 
     * @param vector
     * @return
     * @throws IOException 
     */
    static int [] leerVector (int [] vector) throws IOException {
   
  
            for (byte i=0;i<TAMANO;i++){
            vector[i]=leerInt("Dame el número "+(i+1)+"º\n");
        }
            return vector;
    }
    
    /**
     * 
     * @param vector 
     */
    static void imprimirAlReves (int [] vector) {
   
        for (byte i=TAMANO-1;i>=0;i--){
            System.out.println("El elemento de posición "+(i+1)+" es igual a "+vector[i]);

        }
    }
    
     /**
      * 
      * @param vector
      * @throws IOException 
      */
    static void buscarNumero( int[] vector) throws IOException {
        int num_a_buscar, leerdenuevo;
        boolean coincidencia=false;
        leerdenuevo=leerInt("¿Quieres buscar un número?\nNO=0 ; SI=1\n");
        if (leerdenuevo==1){
            num_a_buscar=leerInt("Qué número quieres comprobar si está?\n");
            
            for (byte i=0;i<TAMANO && coincidencia==false;i++){
                
                if (num_a_buscar==vector[i]){
                    System.out.println("El número que buscas está en la posición "+(i+1));
                    coincidencia=true;                    
                }  
            }
            if (coincidencia==false){
                System.out.println("No se encuentra el número");
            }
        }
    
    }
    
    /**
     * 
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        int vector[] = new int [TAMANO];

        try{
        leerVector(vector);
        imprimirAlReves(vector);
        buscarNumero(vector);
        buscaMayor(vector);
        invertirArray(vector);
        
        
        } catch (IndexOutOfBoundsException o){
            System.out.println("Error. Fuera de los límites del bucle");
        } catch (NumberFormatException o){
            System.out.println("Error de formato");
        } catch (Exception o){            
        }
        
        
    }    
}
