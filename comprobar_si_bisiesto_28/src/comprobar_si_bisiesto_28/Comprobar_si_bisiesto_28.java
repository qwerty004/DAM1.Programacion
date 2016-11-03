//crear un programa en java que lea año y mes y nos muestre los dias
//correspondientes a ese mes
//NOTA: bisiesto si multiplo de 4 y no de 100, o si de 400
package comprobar_si_bisiesto_28;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Comprobar_si_bisiesto_28 { 
    public static void main(String[] args) throws IOException {
        int mes, year;
        InputStreamReader flujo;
        flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        

        System.out.println("introduzca un mes (formato MM)");
        mes=Integer.parseInt(teclado.readLine());
        
        switch (mes){
            case 1:
                System.out.println("El mes de enero tiene 31 días");
                break;
            case 2:
                System.out.println("introduzca un año");
                year=Integer.parseInt(teclado.readLine());
                if (year%4==0) {
                    if (year%400==0){
                        System.out.println("El mes de febrero del año "+year+" tiene 29 días");
                    }
                    else if (year%100==0){
                        System.out.println("El mes de febrero del año "+year+" tiene 28 días");
                    }
                    else {
                            System.out.println("El mes de febrero del año "+year+" tiene 29 días");
                    }
                       
                }
                else {
                    System.out.println("El mes de febrero del año "+year+" tiene 28 días");
                }
                break;
            case 3:
                System.out.println("El mes de marzo tiene 31 días");
                break;
            case 4:
                System.out.println("El mes de abril tiene 30 días");
                break;                
            case 5:                
                System.out.println("El mes de mayo tiene 31 días");
                break;
            case 6:             
                System.out.println("El mes de junio tiene 30 días");
                break;
            case 7:               
                System.out.println("El mes de julio tiene 31 días");
                break;
            case 8:       
                System.out.println("El mes de agosto tiene 31 días");
                break;
            case 9:        
                System.out.println("El mes de septiembre tiene 30 días");
                break;
            case 10:       
                System.out.println("El mes de octubre tiene 31 días");
                break;
            case 11:       
                System.out.println("El mes de noviembre tiene 30 días");
                break;
            case 12:          
                System.out.println("El mes de diciembre tiene 31 días");
                break;
            default:
                
              
        }
        
    }
    
}
