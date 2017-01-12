package conversor;

import static conversor.Lectura.*;
import java.io.IOException;


public class Menu {
   
    public static void elegirMenu() throws IOException{
       boolean salir=false;

        do {
            int opcion = Lectura.leerEntero("¿Que conversión quiere realizar?:\nPulse 1 para convertir euros a libra\nPulse 2 para convertir libra a euros\nPulse 3 para convertir euros a dólares estadounidenses\nPulse 4 para convertir dólares estadounidenses a euros\nPulse 5 para salir");
            double cantidad;
            switch (opcion) {
                case 1:
                    cantidad = leerDouble("\nDeme la cantidad de euros que quiere pasar a libras ");
                    Conversor.eurosALibras(cantidad);
                    break;
                case 2:
                    cantidad = leerDouble("\nDeme la cantidad de libros que quiere pasar a euros ");
                    Conversor.librasAEuros(cantidad);
                    break;
                case 3:
                    cantidad = leerDouble("\nDeme la cantidad de euros que quiere pasar a dólares ");
                    Conversor.eurosADolares(cantidad);
                    break;
                case 4:
                    cantidad = leerDouble("\nDeme la cantidad de dólares que quiere pasar a euros ");
                    Conversor.dolaresAEuros(cantidad);
                    break;
                case 5:
                    salir = true;
                    
                    break;
                default:
                    System.out.println("Error! Opción inexistente");
            }
            
        } while ( salir == false);
    }
    
}
