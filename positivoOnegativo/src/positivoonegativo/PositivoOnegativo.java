package positivoonegativo;
import java.util.Scanner;

public class PositivoOnegativo {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int nota;
        System.out.println("Introduce una calificación numérica entre 0 y 10");
        nota=sc.nextInt();
        if (nota < 0) {
        System.out.println("Nota errónea");    
        }
        else if (nota <5) {
        System.out.println("suspenso");
        }
        else if (nota < 7){
        System.out.println("aprobado");
        }
        else if (nota < 9) {
        System.out.println("Notable");
        }
        else if (nota <= 10){
        System.out.println("Sobresaliente");
        }
        else {
        System.out.println("Nota errónea");
        }
      
    }
    
    
}
