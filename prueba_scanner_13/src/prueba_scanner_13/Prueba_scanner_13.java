package prueba_scanner_13;
import java.util.Scanner;
public class Prueba_scanner_13 {
    public static void main(String[] args) {
        
        // Programa que pasa de km/h a m/s
        
        Scanner objeto_escaner = new Scanner(System.in);
        double velocidad = 0;
        float valorfloat;
        char car; //leer
        String cadena;
        
        System.out.println("Introduzca velocidad en km/h");
        velocidad=objeto_escaner.nextDouble();
        
        System.out.println(velocidad + " Km/h ->" + velocidad*1000/3600);
    }
    
}
