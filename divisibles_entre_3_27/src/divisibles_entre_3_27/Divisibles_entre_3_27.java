//mostrar todos los divisibles entre 3 que estén entre 2
//numeros que se introduzcan por teclado
package divisibles_entre_3_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisibles_entre_3_27 {

    public static void main(String[] args) throws IOException {
        int prime, segun, mini, maxi;
        InputStreamReader flujo;
        flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        System.out.println("introduzca un número");
        prime=Integer.parseInt(teclado.readLine());
        System.out.println("introduzca otro número");
        segun=Integer.parseInt(teclado.readLine());
        
        mini=Math.min(prime,segun);
        maxi=Math.max(prime,segun);
        
        System.out.println("Los numeros divisibles por 3 entre "+mini+" y "+maxi+" son:");
        for (int i=mini+1;i<maxi;i++) {
            if (i%3==0){
                System.out.println(i);
            }
        }
        
    }
}
