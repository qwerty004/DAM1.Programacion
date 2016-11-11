
package conversiones_37;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversiones_37 {
    static  InputStreamReader flujo=new InputStreamReader(System.in);
    static  BufferedReader teclado=new BufferedReader(flujo);
    
   public static void main(String[] args) throws IOException {
       int opcion;

       
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(" * * * * MENU PARA REALIZAR CONVERSIONES * * * * * * * ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        
        do {
            System.out.println("\nIntroduzca una opcion");
            System.out.println("1 para pasar de pulgadas a cm");
            System.out.println("2 para pasar de cm a pulgadas");
            System.out.println("3 para pasar de metros a pies");
            System.out.println("4 para pasar de pies a metros");
            System.out.println("5 para pasar de millas/hora a km/h");
            System.out.println("6 para pasar de km/h a millas/horas");
            System.out.println("7 para salir");
            opcion=Integer.parseInt(teclado.readLine());
            
            if (opcion<1 || opcion > 7){
                System.out.println("Opcion mal introducida. Intente otra vez");
            }
            else if (opcion==7) {
                break;
            }
            else {
                switch (opcion){
                    case 1:
                        convierteCmAPulgadas();
                        break;
                    case 2:
                        conviertePulgadasACm();
                        break;
                    case 3:
                        convierteMetrosAPies();
                        break;
                    case 4:
                        conviertePiesAMetros();
                        break;
                    case 5:
                        convierteMhAKh();
                        break;
                    case 6:
                        convierteKhAMh();
                        break;                       
                }
            }
            
        } while (opcion!=7);
        
 
    
    }
   public static void convierteCmAPulgadas() throws IOException  {
       float x;       
       System.out.println("Introduzca el numero de cm que quieres pasar a pulgadas");
       x=Float.parseFloat(teclado.readLine());
       System.out.println(x+" cms son "+x/2.5+" pulgadas");
   }   
   public static void conviertePulgadasACm() throws IOException  {
       float x;       
       System.out.println("Introduzca el numero de pulgadas que quieres pasar a cm");
       x=Float.parseFloat(teclado.readLine());
       System.out.println(x+" pulgadas son "+2.5*x+" cms");
      } 
   public static void convierteMetrosAPies() throws IOException  {
       float x;       
       System.out.println("Introduzca el numero de metros que quieres pasar a pies");
       x=Float.parseFloat(teclado.readLine());
       System.out.println(x+" metros son "+x/0.3048+" pies");
   } 
   public static void conviertePiesAMetros() throws IOException  {
       float x;     
       System.out.println("Introduzca el numero de pies que quieres pasar a metros");
       x=Float.parseFloat(teclado.readLine());
       System.out.println(x+" pies son "+x*0.3048+" metros");
   }   
   public static void convierteMhAKh() throws IOException  {
       float x; 
       System.out.println("Introduzca el numero de millas/hora que quieres pasar a Km/hora");
       x=Float.parseFloat(teclado.readLine());
       System.out.println(x+" millas/hora son "+(8/(float)5)*x+" Km/hora");
   } 
   public static void convierteKhAMh() throws IOException  {
       float x;         
       System.out.println("Introduzca el numero de Km/hora que quieres pasar a millas/hora");
       x=Float.parseFloat(teclado.readLine());
       System.out.println(x+" km/hora son "+(5.0/(float)8)*x+" millas/hora");
   } 
}
