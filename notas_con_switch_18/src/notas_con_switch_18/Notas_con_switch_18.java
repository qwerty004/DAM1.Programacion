
package notas_con_switch_18;
import java.util.Scanner;
public class Notas_con_switch_18 {
    public static void main(String[] args) {
        Scanner objeto_escaner = new Scanner(System.in);
        int n;
        System.out.println("introduce nota");
        n=objeto_escaner.nextInt();
        
        switch(n){
            case 0:
            case 1:
            case 2:
                System.out.println("Muy def");
                break;
            case 3:
            case 4:
                System.out.println("insuf");
                break;
            case 5:
                System.out.println("suficiente");
                break;
            case 6:
                System.out.println("bien");
                break;
            case 7:
                System.out.println("notable");
                break;
            case 8:
                System.out.println("sobre");
                break;
            case 9:
            case 10:
                System.out.println("Matricula");
                break;
            default:
                System.out.println("ERROR");
        }
        
    }
    
}
