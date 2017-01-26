package caracteres;
import static java.lang.Character.*;    

class Caracteres2 {

    static void caracteres2() {
        byte contDig=0;
        byte contEsp=0;
         String cadena = Lectura.leerString("Dame un texto");
         for (int i = 0; i < cadena.length(); i++) {
             char carac = cadena.charAt(i);
             System.out.println("su numero unicode de esos es "+(int)carac);
            System.out.print("El caracter \""+carac+"\", situado en la posición "+(i+1));

            if (isLetter(carac)==true || (int)carac==65533 || (int)carac==65532) {
                System.out.println(" es una letra");
                
            }
            else {
                System.out.println(" no es una letra");
            }
            if (isDigit(carac)==true) {
                 contDig++;
             }
            if (carac==' '){
                contEsp++;
            }
         }
         System.out.println("En el texto hay "+contDig+" dígitos y "+contEsp+" espacios");
         
         System.out.println("El tamaño de la cadena es "+cadena.length());
         System.out.println("El tamaño de la nueva cadena es "+Character.toString(cadena.charAt(0)).length());
                  

         
         

            
    }
    
}
