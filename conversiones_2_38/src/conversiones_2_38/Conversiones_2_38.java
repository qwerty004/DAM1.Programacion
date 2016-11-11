
package conversiones_2_38;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Conversiones_2_38 {
    static  InputStreamReader flujo=new InputStreamReader(System.in);
    static  BufferedReader teclado=new BufferedReader(flujo);
    
    public static void main(String[] args) throws IOException {
        int opcion;
        float x;

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(" * * * * MENU PARA REALIZAR CONVERSIONES * * * * * * * ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        
        do {
            System.out.println("\nIntroduzca una opcion");
            System.out.println("1 conversión entre pulgadas y cm");
            System.out.println("2 conversión entre metros y pies");
            System.out.println("3 conversión entre millas/hora y km/h");
            System.out.println("4 para salir");
            opcion=Integer.parseInt(teclado.readLine());
            
            if (opcion<1 || opcion > 4){
                System.out.println("Opcion mal introducida. Intente otra vez");
            }
            else if (opcion==4) {
                break;
            }
            else {
                System.out.println("Introduzca el valor que quieres convertir");
                x=Float.parseFloat(teclado.readLine());
                switch (opcion){
                    case 1:
                        cmYpulgadas(x);
                        break;
                    case 2:
                        metrosYPies(x);
                        break;
                    case 3: 
                        mhYKmh(x);         
                        break;                       
                }                
            }            
        } while (opcion!=4);
    }
    public static void cmYpulgadas(float x) throws IOException {
        int opt;
        float salida;
        System.out.println("Pulse 1 para pasar de cm a pulgadas");
        System.out.println("Pulse 2 para pasar de pulgadas a cm");
        opt=Integer.parseInt(teclado.readLine());
        do {
            if (opt==1){
                salida=convierteCmAPulgadas(x);
                System.out.println("El resultado es: "+salida);
            }
            else if (opt==2) {
                salida=conviertePulgadasACm(x);
                System.out.println("El resultado es: "+salida);
            }
            else {
                System.out.println("opción mal introducida. intente de nuevo");
                    }
        } while (opt!=1 && opt!=2);
    }
    public static void metrosYPies(float x) throws IOException {
        int opt;
        float salida;                     
        System.out.println("Pulse 1 para pasar de metros a pies");
        System.out.println("Pulse 2 para pasar de pies a metros");
        opt=Integer.parseInt(teclado.readLine());
        do {
            if (opt==1){
                salida=convierteMetrosAPies(x);
                System.out.println("El resultado es: "+salida);
            }
            else if (opt==2) {
                salida=conviertePulgadasACm(x);
                System.out.println("El resultado es: "+salida);
            }
            else {
                System.out.println("opción mal introducida. intente de nuevo");
                System.out.println("Pulse 1 para pasar de metros a pies");
                System.out.println("Pulse 2 para pasar de pies a metros");
                opt=Integer.parseInt(teclado.readLine());
            }
        }while (opt!=1 && opt!=2);
    }
    public static void mhYKmh(float x) throws IOException {
        int opt;
        float salida;                        
        System.out.println("Pulse 1 para pasar de millas/hora a km/hora");
        System.out.println("Pulse 2 para pasar de km/hora a millas/hora");
        opt=Integer.parseInt(teclado.readLine());
        do {
            if (opt==1){
                salida=convierteMhAKh(x);
                System.out.println("El resultado es: "+salida);
            }
            else if (opt==2) {
                salida=convierteKhAMh(x);
                System.out.println("El resultado es: "+salida);
            }
            else {
                System.out.println("opción mal introducida. intente de nuevo");
                System.out.println("Pulse 1 para pasar de millas/hora a km/hora");
                System.out.println("Pulse 2 para pasar de km/hora a millas/hora");
                opt=Integer.parseInt(teclado.readLine());
                
                    }
        }while (opt!=1 && opt!=2);
        }
    public static float convierteCmAPulgadas(float x) {
        return x/(float)2.5;
    }   
    public static float conviertePulgadasACm(float x)   {
        return (float)2.5*x;
    } 
    public static float convierteMetrosAPies(float x) {
        return x/(float)0.3048;
    } 
    public static float conviertePiesAMetros(float x) {
        return x*(float)0.3048;
    }   
    public static float convierteMhAKh(float x)  {
        return (8/(float)5)*x;
    } 
    public static float convierteKhAMh(float x)  {
        return (5/(float)8)*x;
    } 
}

        
    
    

