
package ordenador56;

public class Ordenador56 {
      String marca;
      String procesador;
      String pantalla;
     boolean estado;

   

    public void  encenderOrdenador() {
        if (estado){
            System.out.println("Encendido");
        }
        else {
            System.out.println("Apagado");
        }
       
    }

    public  void apagarOrdenador() {
        if (!estado){
            System.out.println("Apagado");
        }
        else {
            System.out.println("Encendido");
        }
       
    }

    public void mostrarEstado() {
        if (estado){
            System.out.println("Encendido");
        }
        else {
            System.out.println("Apagado");
        }
       
    }

    public  void mostrarDatos() {
        System.out.println("Marca: "+marca);
        System.out.println("Procesador: "+procesador);
        System.out.println("Pantalla: "+pantalla);
        
        
        
    }

    
       
}
 