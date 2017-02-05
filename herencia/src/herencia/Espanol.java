package herencia;

public class Espanol extends Europeo {
    String numeroSS, nif ;
    
    public Espanol(String nombre, String fechaNac, String numeroSS, String nif) {
        super(nombre, fechaNac);
        this.nif=nif;
        this.numeroSS=numeroSS;
        
    }
    
    void verNif ( ){
        System.out.println("El nif es: "+this.nif);
    }
    
    void vernumeroSS( ){
        System.out.println("El numero de la SS es: "+this.numeroSS);
    }
    
    
    void mostrarDatos( ){
        System.out.println("El nombre es: "+this.nombre);
        System.out.println("La fecha es: "+this.fechaNac);
        System.out.println("El numero de la SS es: "+this.numeroSS);
        System.out.println("El nif es: "+this.nif);
    }

}
    