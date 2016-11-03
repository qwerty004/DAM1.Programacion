package ejemplo_entrada_datos_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo_entrada_datos_25 {
    public static void main (String[] args) throws IOException {
        String nombre;
        int n;
        String s, cadena;
        float f;
        InputStreamReader flujo;
        flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        
        System.out.println("introduzca un nombre: ");
        s=teclado.readLine();
        System.out.println("Su nombre: "+ s);

        System.out.println("introduzca un numero: ");
        cadena=teclado.readLine();
        n=Integer.parseInt(cadena);
        System.out.println( "el numero " +n);

        System.out.println(" introduzca un numero con"+ "decimales: ");
        f= Float.parseFloat(teclado.readLine());
        System.out.println( "el numero "+f);
        
        nombre="Cadenas probando";
        System.out.println( nombre+" " +nombre.charAt(0));
        //pruebas conversiones
        char c=Character.toUpperCase('a');
        System.out.println("pasamos a mayuscula la \"a\": "+c);
        String b=String.valueOf(true);
        System.out.println("b vale "+b);
        float numero=Float.parseFloat("3.99");
        System.out.println("convertimos el string \"3.99\" a float: "+numero);
        System.out.println("........");
        Integer objeto=Integer.valueOf(n);
        //objeto.
        int unnumero=objeto.intValue();
        System.out.println(unnumero+"..."+ objeto.toString());
          System.out.println("ver contenido de objeto: "+objeto);
        
    }
}

