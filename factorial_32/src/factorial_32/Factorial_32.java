package factorial_32;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Factorial_32 {

    

     public static void calculaFactorial(int n)  {
         float factorial;

        factorial=1;
        if (n>0) {
            for (int i=1;i<=n;i++){
                    factorial=factorial*i;                    
                }
        }
       System.out.println("El factorial de "+n+" es "+factorial);
 }
          

   public static void main(String[] args) throws IOException {
        int numero;

        InputStreamReader flujo;
        flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        

        System.out.println("Introduzca un número");
        numero=Integer.parseInt(teclado.readLine());
        
        calculaFactorial(numero);        
            }    
    }
    