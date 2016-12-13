/*


System.arraycopy
Arrays.sort()
Arrays.copyOf()
Arrays.copyOfRange()



*/

package llenarmatriz50;

import java.util.Arrays;

public class LlenarMatriz50 {
    public static void main(String[] args) {
     // declaracion de variables
       int i=0;
       String matriz[]={"Juan","Pedro","Antonio","Marcos"};
        
        String vector[]=new String [6];
        int numeros[]={8,2,4,0,12};
        int numeros2[]=numeros;
        
        
        //rellenar
        Arrays.fill(numeros,0);
        
        //Modificar el contenido del tercer elemento
        
        System.out.println("\n");
        //vector esta vacio
        System.arraycopy(matriz,1,vector,0,2);
        
        
       
       
    } //Cierre del main
        
        
        
        
    }
    
