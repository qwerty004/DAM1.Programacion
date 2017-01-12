
package libros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lectura {
     static  InputStreamReader flujo=new InputStreamReader(System.in);
    static  BufferedReader teclado=new BufferedReader(flujo);

    public String leerString(String texto){
        return texto;
    }
    
    public byte leerByte(String texto){
        byte numero = 0;
        
            boolean bandera;
        do {
            bandera=true;        
         try {
             numero= Byte.parseByte(teclado.readLine());
         } catch (IOException | NumberFormatException e) {
             System.out.println("ERROR! Formato erróneo. Introduzca de nuevo");
             bandera=false;
         }     
         } while (bandera==false);
        return numero;
    }
    
    public int leerEntero(String texto){
       int numero = 0;   
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
    public float leerFloat(String texto){
        float numero = 0;   
    

        boolean bandera;
        do {
            bandera=true;        
         try {
             numero= Float.parseFloat(teclado.readLine());
         } catch (IOException | NumberFormatException e) {
             System.out.println("ERROR! Formato erróneo. Introduzca de nuevo");
             bandera=false;
         }     
         } while (bandera==false);
        return numero;

    }
    public double leerDouble(String texto){
        double numero = 0;
        
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
}
