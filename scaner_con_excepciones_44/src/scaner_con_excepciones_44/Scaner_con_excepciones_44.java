
package scaner_con_excepciones_44;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Scaner_con_excepciones_44 {

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        Scanner sc = null;
        
        int nota = 0, faltas;
        float notafinal;
        System.out.println("Introduce la nota");
        
        try{        
        nota=sc.nextInt();
      
        } catch (InputMismatchException objeto){
            System.out.println("Error a la hora de introducir la nota");
             
        } catch (NullPointerException objeto){
            System.out.println("El objeto no esxite: "+objeto.getMessage());
      
        } catch (Exception objeto){
             System.out.println("ERROR no controlado");
        System.out.println(objeto.getMessage());
         objeto.printStackTrace(); 
         }
        
        
//        System.out.println("Introduce el numero de faltas");
//        faltas=sc.nextInt();
        faltas=2;
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