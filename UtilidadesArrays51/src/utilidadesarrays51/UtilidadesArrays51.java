/* ======>   clase Arrays
 * Leer y almacenar 15 numeros: crear  metodos
  - rellenarTabla()==> crea tabla, rellena y
                devuelve tabla
 *  
 * -permitir hacer una consulta, 
            si existe un número determinado
 * -buscar y mostrar el mayor
 * 
 * - mostrarDatos
 *  -invertirTabla
 *  
 */


package utilidadesarrays51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class UtilidadesArrays51 {
    static  InputStreamReader flujo=new InputStreamReader(System.in);
    static  BufferedReader teclado=new BufferedReader(flujo);
    public static final int TAMANO_ARRAY = 5;

     public static int [] inicializaArray() throws IOException{
        int numeros [] = new int [TAMANO_ARRAY] ;
        int n;
         n=leerInt("Con qué número quiere inicializar el vector?");
        Arrays.fill(numeros,n);
    return numeros;
    }
     
    public static void imprimeArray (int [] numeros){
    System.out.println("El vector es:");
        for (int i=0;i<TAMANO_ARRAY;i++){
            System.out.print(numeros[i]+" ");
            }
         System.out.println("");
     }
    
     static int leerInt (String texto) throws IOException {
    int numero = 0;   
    
        System.out.println(texto);
        boolean bandera;
        do {
            bandera=true;        
         try {
             numero= Integer.parseInt(teclado.readLine());
         } catch (IOException | NumberFormatException e) {
             System.out.println("ERROR! Formato erróneo. Introduzca de nuevo");
             bandera=false;
         }     
         } while (bandera==false);
        return numero;
    }
     
    public static int [] leerArray() throws IOException{
      
        int numeros [] = new int [TAMANO_ARRAY] ;
        for (int i=0;i<TAMANO_ARRAY;i++){
            numeros[i]=leerInt("Introduce el valor de la componente "+(i+1));
        }
        return numeros;
    }
    
    public static void buscaNumero (int [] numeros) throws IOException{
        int numBuscado=leerInt("¿Qué numero quieres buscar?");
        int posicion=binarySearch(numeros,numBuscado);
        if (posicion>=0){
        System.out.println("El número buscado está en la posición "+(posicion+1));
        }
        else {
            System.out.println("El número buscado no está en el vector");
        }
    }
    public static void buscaMayor (int [] numeros) throws IOException{
        sort(numeros);
        System.out.println("El mayor es "+numeros[TAMANO_ARRAY-1]);
    }
    

    
    public static void main(String[] args) throws IOException {
        int vector[] = null;
        int metodoElegido;
        boolean bandera;
        
        metodoElegido=leerInt("Elige una opcion:\nPara crear un array con el mismo numero siempre pulsa 1\nPara ir escribiendo tú el array pulsa 2\n");
        
        do {
                bandera=true;
                switch (metodoElegido) {
                    case 1:
                        vector = inicializaArray();
                        break;
                    case 2:
                        vector = leerArray(); 
                        break;
                    default:
                        System.out.println("Error. No hay esa opcion");
                        bandera=false;
                        metodoElegido=leerInt("introduce de nuevo la opcion deseada");
                }

        } while (bandera==false);
        
        imprimeArray(vector);
        
        
        buscaNumero(vector);
        buscaMayor(vector);
    }
    
}
