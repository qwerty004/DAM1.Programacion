        /* Excep_3Media-3 Propagar excepciones
        1- Leer 5 números. Crear el método leerEntero(),
                    lee y devuelve dato
        controlar excepciones en el main(). Mostrar media
        */
package excep_3media_46;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Excep_3Media_46 {
    static InputStreamReader flujo=new InputStreamReader(System.in);
    static  BufferedReader teclado=new BufferedReader(flujo);  
    public static void main(String[] args) throws IOException {
        int media = 0;
        int numero = 0;
        try {
            for (int i=1;i<6;i++){
                try{
                    numero=leerInt("Introduce la nota "+i+"ª\n");
                } catch (NumberFormatException objeto) {
                    System.out.println("Numero con formato incorrecto");
                }
                media=media+numero;
            }
            media=media/5;
            System.out.println("la media es "+media);
        }catch (Exception objeto){
            System.out.println("ERROR no controlado");
            System.out.println(objeto.getMessage());
            objeto.printStackTrace();
        }
    }
    static int leerInt (String texto) throws IOException {
        int numero;
        System.out.print(texto);
        numero = Integer.parseInt(teclado.readLine());
        return numero;
    } 
}

