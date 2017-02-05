package herencia;

public class Europeo {
    private String nombre,fechaNac;
    Europeo(String nombre, String fechaNac){
        this.nombre=nombre;
        this.fechaNac=fechaNac;
        
    }
    void mostrarDatos(){
        System.out.println("El nombre es: "+this.nombre);
        System.out.println("La fecha es: "+fechaNac);
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }
    
}
