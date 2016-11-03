package seleccion_atleta_14;
import java.util.Scanner;
public class Seleccion_atleta_14 {

    public static void main(String[] args) {   
        Scanner objeto_escaner = new Scanner(System.in);
        String sexo;
        double t;
        int edad;
        System.out.println("Introduce el sexo del atleta (hombre o mujer)");
        sexo=objeto_escaner.next();
        char inicial_del_sexo=sexo.charAt(0);
        System.out.println("Introduce el tiempo del atleta en minutos");
	t=objeto_escaner.nextDouble();
        
        if (inicial_del_sexo == 'h' || inicial_del_sexo == 'H'){
            if (t<= 1.5){
                System.out.println("Atleta seleccionado");         
            }
            else if (t >1.75){
                System.out.println("Atleta no seleccionado");
            }
            else{
                System.out.println("Introduce la edad del atleta");
                edad=objeto_escaner.nextInt();
                
                if (t <=1.75 && edad>40) {
                    System.out.println("Atleta seleccionado");
                }
                else{
                    System.out.println("Atleta no seleccionado");
                }
                           
            }
        }
        else  if (inicial_del_sexo == 'm' || inicial_del_sexo == 'M'){
            if (t<=1.8){
                System.out.println("Atleta seleccionada");
            }
            else {
                System.out.println("Atleta no seleccionada");
            }
        }
        else {
            System.out.println("Sexo introducido incorrectamente");
        }
 }   
}
