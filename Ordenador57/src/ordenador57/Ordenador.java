
package ordenador57;

public class Ordenador {
      private String marca;
      private String procesador;
      private String pantalla;
     boolean estado;

    Ordenador(String marca, String procesador) {
        this.marca=marca;
        this.procesador=procesador;
        
        estado=false;
    }
    void setPantalla (String pan){
        pantalla=pan;
    }

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
 