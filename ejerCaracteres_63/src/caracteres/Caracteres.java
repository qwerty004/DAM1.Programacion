package caracteres;
import static java.lang.Character.*;

public class Caracteres {
    public static void caracteres1 (){    
        String vocales = "AEIOUaeiou";
        String cadena = Lectura.leerString("dame un texto");
        System.out.println("El tamaño de la cadena es "+cadena.length());
        for (int i = 0; i < cadena.length(); i++) {
            char carac = cadena.charAt(i);
            System.out.print("El caracter \""+carac+"\", situado en la posición "+(i+1)+" es");
            if (isLetter(carac)==true) {
                System.out.println(" una letra");
                System.out.print("Está en");
                if (isLowerCase(carac)==true) {
                    System.out.println(" minúscula");                                
            }
                else {
                    System.out.println(" mayúscula");
                }
                
                if (vocales.indexOf(carac)>=0) {
                    System.out.println("Es una vocal");
                    
                }
            }
            else if (isDigit(carac)==true){
                System.out.println(" un dígito");
            }
            else {
                System.out.println(" es un carácter especial");
            }
            

                
        }
        
        }

    
    
}
