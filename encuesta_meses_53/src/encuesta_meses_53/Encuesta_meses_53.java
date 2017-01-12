package encuesta_meses_53;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Encuesta_meses_53 {

        
    static  InputStreamReader flujo=new InputStreamReader(System.in);
    static  BufferedReader teclado=new BufferedReader(flujo);
    
     public static final int N_PERSONAS_ENTREVISTADAS=5;
     
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
    
    
     public static void imprimirArray(int [] array) throws IOException{
        
        
        for (int i = 0; i < array.length ; i++){
                System.out.print(array[i]+" "); 
        }
         System.out.println("");
 
    }
         public static void imprimirArrayString(String [] array) throws IOException{
        
        
        for (int i = 0; i < array.length ; i++){
                System.out.print(array[i]+" "); 
        }
             System.out.println("");
 
    }
    public static void main(String[] args) throws IOException {
        int []cuentaMeses = new int [12];
        String [] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        Arrays.fill(cuentaMeses,0);

        
        System.out.println("Por favor, indicame tu mes de nacimiento");
        for (int i = 0; i < 12; i++) {
            System.out.println("Pulsa "+(i+1)+" para elegir el mes "+meses[i]);
            
                  }
        for (int i = 0; i < N_PERSONAS_ENTREVISTADAS; i++) {
            boolean bandera=true;

            do {
            bandera=true; 
            try {
                int mes = leerInt("Entrevistado "+(i+1)+". Dime tu mes");
                cuentaMeses[mes-1]=cuentaMeses[mes-1]+1;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR! Ese mes no existe. Introducelo de nuevo");
                bandera=false;
            }     
        } while (bandera==false);
            
            
        }
        
        for (int i = 0; i < 12; i++) {
            System.out.println("El número de personas entrevistadas nacidas en "+meses[i]+" es "+cuentaMeses[i]);
        }
    }
    
}
