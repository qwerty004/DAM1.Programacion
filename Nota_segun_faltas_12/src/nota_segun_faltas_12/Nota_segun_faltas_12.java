
package nota_segun_faltas_12;
import java.util.Scanner;
public class Nota_segun_faltas_12 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int nota, faltas;
        float notafinal;
        System.out.println("Introduce la nota");
        nota=sc.nextInt();
        System.out.println("Introduce el numero de faltas");
        faltas=sc.nextInt();
        if (faltas < 5){
            notafinal=nota;
        }
        else if (faltas<=10){
            notafinal=nota-0.5f;
        }
        else if (faltas<20){
            notafinal=nota-1;
        }
        else{
            notafinal=nota-3;
        }
        
        if (nota <= 3){
            System.out.println("Tu nota final es "+ nota);
        }
        else if (notafinal<=3){
            System.out.println("Tu nota final es "+ 3);
        }
        else{
              System.out.println("Tu nota final es "+ notafinal);      
        }
    }
}