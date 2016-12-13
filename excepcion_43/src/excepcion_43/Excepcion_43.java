package excepcion_43;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Excepcion_43 {

    public static void main(String[] args) throws IOException  {
      int i,j;
      String texto;
      InputStreamReader flujo=new InputStreamReader(System.in);
      BufferedReader teclado=new BufferedReader(flujo);
        
      try {
        System.out.println("Numero");
        texto=teclado.readLine();
        i=(Integer.valueOf(texto).intValue());
        System.out.println("Numero");
        texto=teclado.readLine();
        j=(Integer.valueOf(texto).intValue());
        System.out.println("division "+i+"/"+j+"="+i/j);
        
        
      } catch (NumberFormatException objeto) {
          System.out.println("Error: No es un numero");
              System.out.println(objeto.getMessage());
      
      }catch ( ArithmeticException objeto){
          System.out.println("Error: Division por cero");
        
          
         } catch (Exception objeto){
             System.out.println("ERROR no controlado");
        System.out.println(objeto.getMessage());
         objeto.printStackTrace(); 
         }
        System.out.println("FIN..........");
    }
    
}
