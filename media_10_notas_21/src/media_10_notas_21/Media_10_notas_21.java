package media_10_notas_21;

//import.java.io.BufferedReader;
//import java.io.IOException;
    // Leemos 10 numeros y hacemos su media. Solo aceptamos numeros entre y 10
import java.util.Scanner;
public class Media_10_notas_21 {  
    public static void main(String[] args) {
        int nota,i;
        boolean bandera; // falso quiere decir que la nota no esta en el rango
        float media=0;
        final byte CANTIDAD=5;
        Scanner objeto_escaner = new Scanner(System.in);
        for (i=1;i<=CANTIDAD;i++){
            bandera=false;
            while (bandera==false) {
                System.out.println("Dame la "+i+"ª nota (entre 1 y 10)");
                nota=objeto_escaner.nextInt();
                if (nota  >= 1 && nota <=10){
                    bandera=true;
                    media=media+nota; // media+=nota
                }
                else {
                    System.out.println("Nota incorrecta. Intente otra vez");
                }
            }
        }
        media=media/CANTIDAD;
        System.out.println("La media es "+media);
    }
    
    
    
    
}
    

