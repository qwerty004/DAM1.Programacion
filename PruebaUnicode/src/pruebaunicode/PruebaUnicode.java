
package pruebaunicode;

public class PruebaUnicode {
    public static void main(String[] args) {
       char c='€';
       System.out.println("le \ntra " + (int)'A'); //Unicode 2 bytes
       System.out.println("letras " + '\u0041'+" "+'\u00c1'); 
       System.out.println(" euro "+(int)'€'+" "+ c); // convierte a decimal
       System.out.println(" euro "+ '\u20AC' +" "+ c);
       System.out.println(" letras Ñ ñ "+(int)'Ñ'+" "+(int)'ñ');
       System.out.println("secuencias escape "+"\"$\"  "+ "\\A\\");
       System.out.println("letra Ñ "+ '\u00D1'+ " "+'\u00F1');   
       System.out.println("letra Œ "+ '\u0152');
       System.out.println("letra Œ "+ (int)'Œ');
    }
    
}
