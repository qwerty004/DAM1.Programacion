

import static lectura.Lectura.leerEntero;


public class ApCirculo {

    
    public static void main(String[] args) {
        leerEntero("dame el numero que quieras, amigo. Ojo! Tienes que ser entero");
        
        Circulo miCirculo= new Circulo ();
        Circulo circ2 = new Circulo (1);
        miCirculo.setRadio(2);
        miCirculo.calcularArea();
        System.out.println("Area de circulo 1 es "+miCirculo.calcularArea());
        
        System.out.println("Area de circ 2 es: "+circ2.calcularArea());

        

        

        
    }
    
}
