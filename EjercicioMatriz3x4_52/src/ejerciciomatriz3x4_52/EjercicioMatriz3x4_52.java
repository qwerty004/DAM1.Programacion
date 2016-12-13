/*
crear matriz de 3x4
almacenar numeros
metodo mostrar tabla
mostrar los datos de fila 3
mostrar suma de cada fila
mostrar suma columna 3
Donde está el 5º numero?

*/
package ejerciciomatriz3x4_52;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class EjercicioMatriz3x4_52 {
    
    static  InputStreamReader flujo=new InputStreamReader(System.in);
    static  BufferedReader teclado=new BufferedReader(flujo);
    
    
    public static final int TAMANO_COL=4;
    public static final int TAMANO_FIL=3;
    
    
    
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
    
    public static int [][] leerMatriz() throws IOException{
        
        int [][] matriz = new int [TAMANO_FIL][TAMANO_COL];
        for (int i = 0; i < TAMANO_FIL ; i++){
            for (int j = 0; j < TAMANO_COL; j++) {
                matriz[i][j]=leerInt("Introduce el valor de la componente ( "+(i+1)+" , "+(j+1)+" )");
            }
        }
        return matriz;
    }
        public static void imprimirMatriz(int [][] matriz) throws IOException{
        
        
        for (int i = 0; i < TAMANO_FIL ; i++){
            for (int j = 0; j < TAMANO_COL; j++) {
                System.out.print(matriz[i][j]+" "); 
            }
            System.out.println("");
        }
 
    }

    
    public static void main(String[] args) throws IOException {
        int [][] matriz = new int [TAMANO_FIL][TAMANO_COL];
        matriz=leerMatriz();
        imprimirMatriz(matriz);
        System.out.println("\nDatos de la fila 3");
        for (int j = 0; j < TAMANO_COL; j++) {
            System.out.print(matriz[2][j]+" ");             
        }
        
        System.out.println("\nSuma de los datos de cada fila");
        for (int i = 0; i < TAMANO_FIL ; i++){
            int sum = 0;
            for (int j = 0; j < TAMANO_COL; j++) {
                sum+=matriz[i][j]; 
            }
            System.out.println("suma de la fila "+i+" = "+sum);
        }
        
        
    }
    
}
