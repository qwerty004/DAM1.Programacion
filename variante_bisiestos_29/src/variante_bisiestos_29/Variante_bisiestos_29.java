//crear un programa en java que lea año y mes y nos muestre los dias
//correspondientes a ese mes
//NOTA: bisiesto si multiplo de 4 y no de 100, o si de 400
package variante_bisiestos_29;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Variante_bisiestos_29 {
         public static void main(String[] args) throws IOException {
        int mes, year;
        InputStreamReader flujo;
        flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        

        System.out.println("introduzca un mes (formato MM)");
        mes=Integer.parseInt(teclado.readLine());
        
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes tiene 31 días");
                break;
                
            case 2:
                System.out.println("introduzca un año");
                year=Integer.parseInt(teclado.readLine());
                if (year%4==0 && (!(year%100==0) || (year%400==0))) {          
                    System.out.println("El mes de febrero del año "+year+" tiene 29 días");     
                }
                else {
                    System.out.println("El mes de febrero del año "+year+" tiene 28 días");
                }
                break;
           
            case 4: case 6: case 9: case 11: 
                System.out.println("El mes tiene 30 días");
                break;                
            
            
            default:
                System.out.println("Mes mal introducido");
                break;
              
        }
        
    }
    
}
